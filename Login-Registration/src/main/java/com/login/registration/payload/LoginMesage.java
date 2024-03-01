package com.login.registration.payload;

public class LoginMesage {
    String message;
    boolean status;

    public LoginMesage(String message, boolean b) {
        this.message = message;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public boolean isStatus() {
        return status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
