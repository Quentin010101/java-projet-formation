package com.example.projetformationjava.model.bean;

import jakarta.persistence.*;

@Entity
@Table(name = "pivot_category_image")
public class PivotCategoryImage {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private long categoryid;
    private long imageid;

    public PivotCategoryImage(){}
}
