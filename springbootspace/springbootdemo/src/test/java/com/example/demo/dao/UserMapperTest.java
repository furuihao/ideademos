package com.example.demo.dao;

import com.example.demo.modules.User;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import javax.annotation.Resource;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
@WebAppConfiguration
public class UserMapperTest {

    @Resource
    private UserMapper userMapper;

    @Before
    public void setUp() {
        // 准备，清空user表
        userMapper.deleteAll();
    }

    @Test
    public void test() throws Exception {
        userMapper.insert("kk", 1);
        userMapper.insert("kk", 1);
        userMapper.insert("kk", 1);
        userMapper.insert("kk", 1);
        userMapper.insert("kk", 1);
        userMapper.insert("kk", 1);
        userMapper.insert("kk", 1);
        userMapper.insert("kk", 1);
        userMapper.insert("kk", 1);
        userMapper.insert("kk", 1);

        List<User> list = userMapper.findByName("kk");
        for (User u : list) {
            System.out.println(u.getName());
        }

    }

}

