package com.example.demo.service.impl;

import com.example.demo.dao.UserDao;
import com.example.demo.modules.User;
import com.example.demo.service.UserJpaService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class UserJpaServiceImpl implements UserJpaService {
    @Resource
    private UserDao userDao;

    @Override
    public void save(String name,Integer age) {
        User user = new User(name,age);
        userDao.save(user);
    }

    @Override
    public void delAll() {
        userDao.deleteAll();
    }

    @Override
    public List<User> getAllUsers() {
        return userDao.findAll();
    }

    @Override
    public void deleteByName(String name) {
        User user = userDao.findUser(name);
        userDao.delete(user);
    }
}
