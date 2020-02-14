package com.example.jdbch2.controller;

import com.example.jdbch2.Customer;
import com.example.jdbch2.service.RunService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@Controller

public class HelloController {

    @Autowired
        private RunService runService;

//    @Value("${helloworld}")
//        private String hello;
//    @Resource
//        private Customer customer;

    @RequestMapping(value = "show" , method=RequestMethod.GET)
    public String show(Model model){
        model.addAttribute("uid","123456");
        model.addAttribute("name","Jerry");
        System.out.println("Hello");

        return "show";
    }
//    @GetMapping("/hi")
//    public String hi(@RequestParam(name="name",required = false,defaultValue = "World")String name, Model model){
//        model.addAttribute("name",name);
//        return "hi";
//    }
}
