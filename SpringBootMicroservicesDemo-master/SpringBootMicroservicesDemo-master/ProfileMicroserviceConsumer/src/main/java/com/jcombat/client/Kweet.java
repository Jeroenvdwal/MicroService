package com.jcombat.client;

import org.apache.catalina.User;

public class Kweet {
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    private String id;
    private String message;
    private String username;

    public Kweet(){

    }

    public Kweet(String Id, String Message, String Username){
        this.id = Id;
        this.message = Message;
        this.username = Username;
    }
}
