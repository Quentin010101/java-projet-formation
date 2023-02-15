package com.example.projetformationjava.model.bean.dao;

import jakarta.persistence.*;

@Entity
@Table(name = "user")
public class UserBean {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long userid;
    private String pseudo;
    private String sessionId;
    private String password;
    private String name;
    private String surname;
    private String email;
    private String role;
    private String avatarPath;
    private String country;
    private Long date;


    public UserBean(String pseudo, String password, String email, String role, long date) {
        this.pseudo = pseudo;
        this.password = password;
        this.email = email;
        this.role = role;
        this.date = date;
    }
    public UserBean(){

    }
    public String getPassword() {
        return password;
    }

    public String getSessionId() {
        return sessionId;
    }

    public void setSessionId(String sessionId) {
        this.sessionId = sessionId;
    }

    public String getPseudo() {
        return pseudo;
    }

    public void setPseudo(String pseudo) {
        this.pseudo = pseudo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getAvatarPath() {
        return avatarPath;
    }

    public void setAvatarPath(String avatarPath) {
        this.avatarPath = avatarPath;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public long getUserid() {
        return userid;
    }

    public void setUserid(int userid) {
        this.userid = userid;
    }

    public void setDate(Long date) {
        this.date = date;
    }

    public Long getDate() {
        return date;
    }

    @Override
    public String toString() {
        return "UserBean{" +
                "userid=" + userid +
                ", pseudo='" + pseudo + '\'' +
                ", sessionId='" + sessionId + '\'' +
                ", password='" + password + '\'' +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", email='" + email + '\'' +
                ", role='" + role + '\'' +
                ", avatarPath='" + avatarPath + '\'' +
                ", country='" + country + '\'' +
                ", date=" + date +
                '}';
    }
}
