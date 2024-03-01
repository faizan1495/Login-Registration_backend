package com.login.registration.dto;

public class LoginDTO {
    private String email;
    private String password;

    public LoginDTO() {
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public LoginDTO(String email, String password) {
        this.email = email;
        this.password = password;
    } //create getters and setters
}