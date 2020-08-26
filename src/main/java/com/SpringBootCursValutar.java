package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication(scanBasePackages = "com.*.*")
@ComponentScan(basePackages = {"com.controllers","com.services"})
public class SpringBootCursValutar {
  
  public static void main(String[] args) {
    SpringApplication.run(SpringBootCursValutar.class, args);
    }
  
}
