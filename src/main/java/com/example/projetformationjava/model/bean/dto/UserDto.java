package com.example.projetformationjava.model.bean.dto;

public class UserDto {
    private long userid;
    private String avatarPath;
    private String pseudo;
    private String name;
    private String surname;
    private String email;
    private String country;
    public UserDto(){}
    @Override
    public String toString() {
        return "UserDto{" +
                "userid=" + userid +
                ", avatarPath='" + avatarPath + '\'' +
                ", pseudo='" + pseudo + '\'' +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", email='" + email + '\'' +
                ", country='" + country + '\'' +
                '}';
    }

    public long getUserid() {
        return userid;
    }

    public void setUserid(long userid) {
        this.userid = userid;
    }

    public String getAvatarPath() {
        return avatarPath;
    }

    public void setAvatarPath(String avatarPath) {
        this.avatarPath = avatarPath;
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

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}
