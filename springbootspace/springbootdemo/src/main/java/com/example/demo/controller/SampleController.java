package com.example.demo.controller;

import com.example.demo.exceptions.JsonMsgException;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SampleController {

    @RequestMapping("/index")
    public String testDefaultException() throws Exception {
//        return "index";
        throw new Exception("测试统一异常处理");
    }

    @RequestMapping("/testJsonMsgExceptionHandler")
    public String testJsonMsgExceptionHandler() throws JsonMsgException {
        throw new JsonMsgException("Json msg 统一异常处理");
    }

    @RequestMapping("/hello")
    @ResponseBody
    String home() {
        return "Hello World!";
    }

    @RequestMapping("/testThymeleafPage")
    public String testThymeleafPage(ModelMap map) {
        map.addAttribute("host", "http://www.baidu.com");
        return "ThymeleafTest";
    }

    @RequestMapping("/aopLog")
    @ResponseBody
    public String aopLog(String name) {
        return "aopLog:"+name;
    }
}
