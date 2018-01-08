package com.example.demo.controller;

import com.example.demo.modules.User;
import io.swagger.annotations.ApiOperation;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@Controller
@RequestMapping(value = "/security")
public class SecurityController {

    @RequestMapping("/")
    public String index(){
        return "security/index";
    }

    @RequestMapping("/hello")
    public String hello(){
        return "security/hello";
    }

}
