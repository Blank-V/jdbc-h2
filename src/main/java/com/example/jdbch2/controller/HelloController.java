package com.example.jdbch2.controller;

import com.example.jdbch2.Customer;
import com.example.jdbch2.service.RunService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController

public class HelloController {

    @Autowired
        private RunService runService;

    @Value("${helloworld}")
        private String hello;
    @Resource
        private Customer customer;

    @RequestMapping("/hello")
    public String hello(){


        return runService.writeRun();

//        customer.setFirstName("Job");
//        customer.setLastName("mia");
//        return hello +"<br/>"+
//                "firstName: "+customer.getFirstName()+"<br/>"+
//                "lastName: "+ customer.getLastName();
    }
}
