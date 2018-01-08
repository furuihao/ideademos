package com.example.demo;

import com.example.demo.modules.User;
import org.jasypt.encryption.StringEncryptor;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.core.io.ClassPathResource;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import javax.annotation.Resource;

@RunWith(SpringRunner.class)
@SpringBootTest
@WebAppConfiguration
public class JasyptTest {

    @Resource
    private StringEncryptor stringEncryptor;

    @Test
    public void test(){

        System.out.println("生成加密后的数据库用户名："+stringEncryptor.encrypt("furuihao"));
        System.out.println("生成加密后的数据库密码："+stringEncryptor.encrypt("furuihao"));

    }
}


