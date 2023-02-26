package com.example.projetformationjava.model.bean.dao;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name="pivot_image_user")
@Getter
@Setter
public class PivotImageUser {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private long imageid;

    private long userid;

    public PivotImageUser(){

    }
}
