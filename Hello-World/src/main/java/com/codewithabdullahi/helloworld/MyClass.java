package com.codewithabdullahi.helloworld;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyClass {
    @GetMapping("/")
    public String welcome() {
        return """
        
        <h1>WELCOME TO SPRING BOOT</h1>

        <br>

        <h2>Application Information</h2>

        <p><b>Application Name:</b> Hello World App</p>
        <p><b>Framework:</b> Spring Boot</p>
        <p><b>Language:</b> Java</p>

        <br>

        <h2>Student Information</h2>

        <p><b>Student Name:</b> Eng Abdullahi</p>
        <p><b>Course:</b> Software Engineering</p>

        <br>

        <h2>Description</h2>

        <p>
        This is my first professional Spring Boot
        web application.
        </p>

        <br>

        <h2>Status</h2>

        <p>Server Running Successfully...</p>

        """;
    }
}
