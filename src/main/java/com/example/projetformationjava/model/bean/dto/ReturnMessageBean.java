package com.example.projetformationjava.model.bean.dto;

public class ReturnMessageBean {
    private boolean bool;
    private String message;

    private String token;

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }
    public ReturnMessageBean(boolean bool, String message, String token) {
        this.bool = bool;
        this.message = message;
        this.token = token;
    }
    public ReturnMessageBean(boolean bool, String message) {
        this.bool = bool;
        this.message = message;
    }

    public ReturnMessageBean() {
    }

    public boolean isBool() {
        return bool;
    }

    public void setBool(boolean bool) {
        this.bool = bool;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
