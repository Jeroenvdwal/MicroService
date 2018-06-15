package com.jcombat.profile;

import java.io.Serializable;

public class User implements Serializable {

    private static final long serialVersionUID = 1L;
    private String userId;
    private String name;

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    private String password;

    public String getUserId() {
        return userId;
    }
    public void setUserId(String userId) {
        this.userId = userId;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Profile [userId=" + userId + ", name=" + name + ", password=" + password +"]";
    }

    public User() {
        // TODO Auto-generated constructor stub
    }

    public User(String userId, String name, String password) {
        super();
        this.userId = userId;
        this.name = name;
        this.password = password;
    }
}
