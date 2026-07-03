package com.codewithabdullahi.myfirstspringboot;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyClass {

    @GetMapping("/")
    public String hello() {

        return "Hello Spring Boot";

    }

}