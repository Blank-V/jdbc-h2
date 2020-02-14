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

    @GetMapping("/greeting")
    @ResponseBody
    public String greeting(){
        System.out.println("Hello");
        return "greeting";

//        customer.setFirstName("Job");
//        customer.setLastName("mia");
//        return hello +"<br/>"+
//                "firstName: "+customer.getFirstName()+"<br/>"+
//                "lastName: "+ customer.getLastName();
    }
    @GetMapping("/hi")
    public String hi(@RequestParam(name="name",required = false,defaultValue = "World")String name, Model model){
        model.addAttribute("name",name);
        return "hi";
    }
}
