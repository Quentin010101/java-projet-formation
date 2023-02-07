package com.example.projetformationjava.model.dto;

import com.example.projetformationjava.model.bean.UserBean;
import jakarta.persistence.*;

@Entity
@Table(name = "user")
public class UserDTO{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long userid;
    private String pseudo;

    public String getPseudo() {
        return pseudo;
    }
}
