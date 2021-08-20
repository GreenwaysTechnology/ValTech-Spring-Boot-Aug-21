package com.example.restapp.resources;

public class LoginForm {
    private String userName;
    private String passwrod;

    public LoginForm() {
    }

    public LoginForm(String userName, String passwrod) {
        this.userName = userName;
        this.passwrod = passwrod;
    }

    @Override
    public String toString() {
        return "LoginForm{" +
                "userName='" + userName + '\'' +
                ", passwrod='" + passwrod + '\'' +
                '}';
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPasswrod() {
        return passwrod;
    }

    public void setPasswrod(String passwrod) {
        this.passwrod = passwrod;
    }
}
