package com.example.LDAPApplication;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeResource {

    @GetMapping("/home")
    public String getRequest(){
        return "<h1> Home Page </h1>";
    }
}
