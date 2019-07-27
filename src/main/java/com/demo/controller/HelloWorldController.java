package com.demo.controller;

import com.demo.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/springboot")
public class HelloWorldController {

    @Autowired
    User user;

    @RequestMapping(value = {"/{name}"}, method = RequestMethod.GET)
    @ResponseBody
    public String sayWorld(@PathVariable("name") String name) {
        System.out.println("userName: " + user.getName());
        System.out.println("age: " + user.getAge());
        System.out.println("remark=" + user.getRemark());
        return "Hello " + name;
    }
}
