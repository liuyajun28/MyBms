package com.bms.mybms.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.bms.mybms.service.UserService;

@Controller
@RequestMapping("/user")  
public class UserController {
    @Resource  
    private UserService userService;  
      
    //登录  
    @RequestMapping(value="/login",method = RequestMethod.POST)  
    @ResponseBody  
    public String login(String user_name, String user_password)  
    {  
        if(userService.login(user_name, user_password)!=null)  
        {  
            return "OK";  
        }  
  
        return "ERROR";  
    }  
}
