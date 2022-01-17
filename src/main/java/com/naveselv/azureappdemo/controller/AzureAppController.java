package com.naveselv.azureappdemo.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/main")
public class AzureAppController {
    @GetMapping("/")
    public ResponseEntity<String> get(){
        return ResponseEntity.ok("Hello main Azure!!!");
    }
}
