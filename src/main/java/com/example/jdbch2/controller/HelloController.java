package com.example.jdbch2.controller;

import com.example.jdbch2.Customer;
import com.example.jdbch2.dao.User;
import com.example.jdbch2.dao.UserDao;
import com.example.jdbch2.service.RunService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.*;

@Controller

public class HelloController {

    @Autowired
        private RunService runService;

//    @Value("${helloworld}")
//        private String hello;
//    @Resource
//        private Customer customer;
@RequestMapping(value = "/user/map", method = RequestMethod.GET)
public String map(Model model) {
    Map<String, User> allMembers = new HashMap<String,User>();
    for (int x = 0; x < 10; x++) {
        User vo = new User();
        vo.setUid(101L + x);
        vo.setName("赵四 - " + x);
        vo.setAge(9);
        vo.setSalary(99999.99);
        vo.setBirthday(new Date());
        allMembers.put("mldn-" + x, vo);
    }
    model.addAttribute("allUsers", allMembers);
    return "user_map";
}

    @RequestMapping(value = "/user/list", method = RequestMethod.GET)
    public String list(Model model) {
        List<User> allMembers = new ArrayList<User>();
        for (int x = 0; x < 10; x++) {
            User vo = new User();
            vo.setUid(101L + x);
            vo.setName("赵四 - " + x);
            vo.setAge(9);
            vo.setSalary(99999.99);
            vo.setBirthday(new Date());
            allMembers.add(vo) ;
        }
        model.addAttribute("allUsers", allMembers);
        return "user_list";
    }
    @RequestMapping(value = "show" , method=RequestMethod.GET)
    public String show(Model model){
        UserDao user = new UserDao();
        user.setStartTime("Tom");
        user.setEndTime(111);
        user.setBirthDay(new Date());
        model.addAttribute("user",user);
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
