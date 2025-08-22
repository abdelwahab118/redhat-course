package com.alahli.demoopenshift;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DemoOpenShiftApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoOpenShiftApplication.class, args);
    }

    @GetMapping("/")
    public String helloWorld(){
        return "Hello World";
    }
}


