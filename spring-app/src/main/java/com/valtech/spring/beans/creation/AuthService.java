package com.valtech.spring.beans.creation;

public class AuthService {
    private String userName = "admin";
    private String password = "admin";

    private AuthService() {
    }

    // Factory Api
    public static AuthService getInstance() {
        return new AuthService();
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    // Biz Api
    public boolean login(String userName, String password) {
        if (this.getUserName().equals(userName) && this.getPassword().equals(password)) {

            return true;
        }
        return false;
    }
}
