package com.example.projetformationjava.model.bean.dao;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "pivot_category_image")
@Getter
@Setter
public class PivotCategoryImage {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private long categoryid;
    private long imageid;


    public PivotCategoryImage(){}
}
