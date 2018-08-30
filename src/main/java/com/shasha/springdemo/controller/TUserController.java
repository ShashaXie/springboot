package com.shasha.springdemo.controller;

import com.shasha.springdemo.model.TUser;
import com.shasha.springdemo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/user")
public class TUserController {

    @Autowired
    UserService userService;

    @RequestMapping("/getUser")
    public String getUserInfo() {
        String username = userService.getUserInfo();
        return username;
    }

    @RequestMapping("/insertUser")
    public int insertUser(TUser tUser){


        System.out.println("test");
        return 0;
    }

}
