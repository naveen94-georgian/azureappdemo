FROM openjdk:8-jdk-alpine
MAINTAINER naveselv.com
COPY target/azureappdemo-0.0.1-SNAPSHOT.jar azureappdemo-1.0.0.jar
ENTRYPOINT ["java", "-jar", "/azureappdemo-1.0.0.jar"]