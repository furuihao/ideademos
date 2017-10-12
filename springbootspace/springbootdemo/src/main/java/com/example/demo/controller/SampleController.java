package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SampleController {

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
}
