package com.shasha.springdemo.service.impl;

import com.shasha.springdemo.dao.TUserMapper;
import com.shasha.springdemo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    TUserMapper tUserMapper;

    @Override
   public String getUserInfo(){
        String username =  tUserMapper.getUserInfo();

        return username;
    }


}
