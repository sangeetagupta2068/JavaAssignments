package com.domain.sangeetagupta.demo_exception_handling;

import java.util.regex.Pattern;

public class User {
    private String username;
    private String password;

    User() throws InvalidUserException{
        throw new InvalidUserException("User and password field empty");
    }
    User(String username,String password) throws InvalidUserException{
        if(username.isEmpty() || password.isEmpty()){
            throw new InvalidUserException("User and password field empty");
        }

        if(password.length()<8){
            throw new InvalidUserException("Password length should be minimum 8");
        }

        Pattern special = Pattern.compile("[!@#$%&*()_+=|<>?{}\\[\\]~-]");
        if(!(special.matcher(password).find())){
            throw new InvalidUserException("Password should contain special character");
        }
        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
