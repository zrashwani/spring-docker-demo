package com.zrashwani.demo.service;

import com.zrashwani.demo.entity.Users;
import com.zrashwani.demo.repository.UsersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsersService {

    @Autowired
    private UsersRepository usersRepository;

    public List<Users> findUsers(){
        return usersRepository.getAll();
    }
}
