package com.example.demo;

import com.example.demo.modules.User;
import org.junit.Test;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

public class UtilsTest {
    @Test
    public void test(){
        ClassPathResource res = new ClassPathResource("beans.xml");
//        DefaultListableBeanFactory factory = new DefaultListableBeanFactory();
        XmlBeanFactory factory = new XmlBeanFactory(res);
//        XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(factory);
//        reader.loadBeanDefinitions(res);
        User user = (User) factory.getBean("user");
        System.out.println(user.getName());
    }
}


