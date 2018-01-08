package com.example.demo.service.impl;

import com.example.demo.annotations.Log;
import com.example.demo.dao.UserMapper;
import com.example.demo.modules.User;
import com.example.demo.service.UserService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    private Logger logger = Logger.getLogger(getClass());
    @Autowired
    private JdbcTemplate jdbcTemplate;
    @Resource
    private UserMapper userMapper;

    @Override
    public void create(String name, Integer age) {
        jdbcTemplate.update("insert into USER(NAME, AGE) values(?, ?)", name, age);
    }

    @Override
    public void deleteByName(String name) {

        jdbcTemplate.update("delete from USER where NAME = ?", name);
    }

    @Override
    public Integer getAllUsers() {
        logger.info("输出info");

        logger.debug("输出debug");

        logger.error("输出error");

        return jdbcTemplate.queryForObject("select count(1) from USER", Integer.class);
    }

    @Override
    public void deleteAllUsers() {
        jdbcTemplate.update("delete from USER");
    }

    @Override
    @Log
    public List<User> findByName(String name) {
        return userMapper.findByName(name);
    }
}
