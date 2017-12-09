package com.example.demo.service;

import org.junit.Assert;
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
public class UserJpaServiceTest {

    @Resource
    private UserJpaService userJpaService;

    @Before
    public void setUp() {
        // 准备，清空user表
        userJpaService.delAll();
    }

    @Test
    public void test() throws Exception {
        // 插入5个用户
        userJpaService.save("a", 1);
        userJpaService.save("b", 2);
        userJpaService.save("c", 3);
        userJpaService.save("d", 4);
        userJpaService.save("e", 5);
        userJpaService.save("f", 6);
        // 查数据库，应该有5个用户
        Assert.assertEquals(6, userJpaService.getAllUsers().size());
        // 删除两个用户
        userJpaService.deleteByName("a");
        userJpaService.deleteByName("e");
        // 查数据库，应该有3个用户
        Assert.assertEquals(4, userJpaService.getAllUsers().size());
    }

}

