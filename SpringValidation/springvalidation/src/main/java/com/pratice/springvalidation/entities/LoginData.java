package com.pratice.springvalidation.entities;

import jakarta.validation.constraints.*;

public class LoginData {

    @NotBlank(message = "User Name can not be empty!")
    @Size(min=3,max = 12,message = "User Name must be between 3-12 characters!")
    private String userName;

    @Email(regexp = "^[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.-]+$",message = "Invalid email!")
    private String email;

    @AssertTrue(message = "Must agree terms and condition!")
    private boolean agreed;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public boolean isAgreed() {
        return agreed;
    }

    public void setAgreed(boolean agreed) {
        this.agreed = agreed;
    }

    @Override
    public String toString() {
        return "LoginData{" +
                "userName='" + userName + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
