package com.example.demo;

import org.apache.log4j.Logger;
import org.junit.Test;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;

@RunWith(SpringRunner.class)
@SpringBootTest
@WebAppConfiguration
public class UtilsTest {
    private Logger logger = Logger.getLogger(getClass());
    @Test
    public void test(){
       /* ClassPathResource res = new ClassPathResource("beans.xml");
//        DefaultListableBeanFactory factory = new DefaultListableBeanFactory();
        XmlBeanFactory factory = new XmlBeanFactory(res);
//        XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(factory);
//        reader.loadBeanDefinitions(res);
        User user = (User) factory.getBean("user");

        System.out.println(user.getName());
        User u = new User();
        BeanUtils.copyProperties(user,u);
        System.out.println(u.getName());

        System.out.println(user.getName());*/

        logger.info("输出info");

        logger.debug("输出debug");

        logger.error("输出error2222222");

    }
}


