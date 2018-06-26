package com.bms.mybms.dao;

import org.apache.ibatis.annotations.Param;

import com.bms.mybms.entity.User;

public interface UserDao {
	//根据用户名，密码进行登录  
    public User login(@Param(value="user_name")String user_name,@Param(value="user_password")String user_password);  
}
