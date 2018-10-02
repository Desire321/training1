package com.example.HelloBoot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class HelloBootApplication extends SpringBootServletInitializer {

    public static void main(String[] args) {
        SpringApplication.run(HelloBootApplication.class, args);
    }

    @RequestMapping("/")
    String hello() {
        return "Welcome guys!";
    }

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(HelloBootApplication.class);
    }
}
