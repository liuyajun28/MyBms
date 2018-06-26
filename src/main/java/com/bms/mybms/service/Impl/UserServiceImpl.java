package com.bms.mybms.service.Impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.bms.mybms.dao.UserDao;
import com.bms.mybms.entity.User;
import com.bms.mybms.service.UserService;

@Service("userService")
public class UserServiceImpl implements UserService{
    @Resource  
    private UserDao userDao;  
    @Override
    public User login(String user_name, String user_password) {  
        return userDao.login(user_name, user_password);  
    } 
}
