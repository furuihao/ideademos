package com.example.demo;

import com.example.demo.controller.SampleController;
import com.example.demo.properties.AuthPropertie;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import javax.annotation.Resource;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)
@SpringBootTest
@WebAppConfiguration
public class DemoApplicationTests {
    private MockMvc mvc;
    @Resource
    private AuthPropertie propertie;

    @Before
    public void setUp() throws Exception {
        mvc = MockMvcBuilders.standaloneSetup(new SampleController()).build();
    }

    @Test
    public void testGetHello() throws Exception {
        mvc.perform(MockMvcRequestBuilders.get("/hello").accept(MediaType.APPLICATION_JSON)).
                andExpect(status().isOk()).andExpect(content().string(equalTo("Hello World!")));
    }

    @Test
    public void testGetPts(){
        Assert.assertEquals(propertie.getName(),"kk");
        Assert.assertEquals(propertie.getTitle(),"soft");
        Assert.assertEquals(propertie.getDesc(),"kk是一个soft");
    }

    @Test
    public void contextLoads() {
    }

}
