package com.example.demo.service;

import com.example.demo.modules.User;

import java.util.List;

public interface UserJpaService {
    void save(String name,Integer age);
    void delAll();

    List<User> getAllUsers();

    void deleteByName(String name);
}




