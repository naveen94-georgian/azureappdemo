package com.naveselv.azureappdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.view.RedirectView;

@SpringBootApplication
public class AzureappdemoApplication {

	@GetMapping("/")
	public RedirectView redirectReq(){
		return new RedirectView("/main");
	}

	public static void main(String[] args) {
		SpringApplication.run(AzureappdemoApplication.class, args);
	}

}
