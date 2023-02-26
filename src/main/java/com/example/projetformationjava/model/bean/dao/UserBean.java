package com.example.projetformationjava.model.bean.dao;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.mindrot.jbcrypt.BCrypt;

@Entity
@Table(name = "user")
@Getter
@Setter
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


    public UserBean(String pseudo, String email, String role, long date) {
        this.pseudo = pseudo;
        this.email = email;
        this.role = role;
        this.date = date;
    }
    public UserBean(){}

    public void encrypt(String password){
        String hashed = BCrypt.hashpw(password, BCrypt.gensalt());
        setPassword(hashed);
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
