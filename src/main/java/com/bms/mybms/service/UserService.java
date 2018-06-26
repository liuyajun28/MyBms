package com.bms.mybms.service;

import com.bms.mybms.entity.User;

public interface UserService {
	public User login(String user_name,String user_password);  
}
