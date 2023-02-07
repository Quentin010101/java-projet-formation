package com.example.projetformationjava.model.bean;

import jakarta.persistence.*;

@Entity
@Table(name="pivot-image-user")
public class PivotImageUser {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;



}
