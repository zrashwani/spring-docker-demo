package com.zrashwani.demo.controller;

import com.zrashwani.demo.entity.Users;
import com.zrashwani.demo.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UsersController {

    @Autowired
    private UsersService usersService;

    @GetMapping(value = "/users/all", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Users> getAll() {
        return usersService.findUsers();
    }
}
