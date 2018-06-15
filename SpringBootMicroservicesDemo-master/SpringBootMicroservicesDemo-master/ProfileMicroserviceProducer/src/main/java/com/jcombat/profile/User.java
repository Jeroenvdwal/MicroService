package com.jcombat.profile;

import java.io.Serializable;

public class User implements Serializable {

    private static final long serialVersionUID = 1L;
    private String userID;
    private String name;

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    private String password;

    public String getUserID() {
        return userID;
    }
    public void setUserID(String userId) {
        this.userID = userID;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Profile [userID=" + userID + ", name=" + name + ", password=" + password +"]";
    }

    public User() {
        // TODO Auto-generated constructor stub
    }

    public User(String userID, String name, String password) {
        super();
        this.userID = userID;
        this.name = name;
        this.password = password;
    }
}
