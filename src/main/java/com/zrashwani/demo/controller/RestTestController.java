package com.zrashwani.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestTestController {

    @GetMapping("/")
    public String demoAction(){
        return "Welcome to spring app in docker, running on java: " + System.getProperty("java.version");
    }
}
