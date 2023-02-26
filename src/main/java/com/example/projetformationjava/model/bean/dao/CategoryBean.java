package com.example.projetformationjava.model.bean.dao;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name="category")
@Getter
@Setter
public class CategoryBean {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long categoryid;
    private String type;

    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(name = "pivot_category_image" ,
            joinColumns = @JoinColumn(name="categoryid"),
            inverseJoinColumns = @JoinColumn(name="imageid") )
    private List<ImageBean> listeImage = new ArrayList<>();

}
