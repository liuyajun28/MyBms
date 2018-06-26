package com.bms.mybms.entity;

public class User {
	private String user_id;  
    private String user_name;  
    private String user_password;  
    private String user_info;  
    private String role;  
    public String getUser_id() {  
        return user_id;  
    }  
    public void setUser_id(String user_id) {  
        this.user_id = user_id;  
    }  
    public String getUser_name() {  
        return user_name;  
    }  
    public void setUser_name(String user_name) {  
        this.user_name = user_name;  
    }  
    public String getUser_password() {  
        return user_password;  
    }  
    public void setUser_password(String user_password) {  
        this.user_password = user_password;  
    }  
    public String getUser_info() {  
        return user_info;  
    }  
    public void setUser_info(String user_info) {  
        this.user_info = user_info;  
    }  
    public String getRole() {  
        return role;  
    }  
    public void setRole(String role) {  
        this.role = role;  
    }  
    public User() {  
        super();  
    }  
    public User(String user_id, String user_name, String user_password,  
            String user_info, String role) {  
        super();  
        this.user_id = user_id;  
        this.user_name = user_name;  
        this.user_password = user_password;  
        this.user_info = user_info;  
        this.role = role;  
    }  
    @Override  
    public String toString() {  
        return "User [user_id=" + user_id + ", user_name=" + user_name  
                + ", user_password=" + user_password + ", user_info="  
                + user_info + ", role=" + role + "]";  
    }  
}
