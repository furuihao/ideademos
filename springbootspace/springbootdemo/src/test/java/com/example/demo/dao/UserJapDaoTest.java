package com.example.demo.dao;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import javax.annotation.Resource;

@RunWith(SpringRunner.class)
@SpringBootTest
@WebAppConfiguration
public class UserJapDaoTest {

    @Resource
    private UserDao userDao;

    @Before
    public void setUp() {
        // 准备，清空user表
        userDao.deleteAll();
    }

    @Test
    public void test() throws Exception {


    }

}

