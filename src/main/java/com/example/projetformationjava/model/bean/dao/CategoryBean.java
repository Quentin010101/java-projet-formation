package com.example.projetformationjava.model.bean.dao;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name="category")
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

    public List<ImageBean> getListeImage() {
        return listeImage;
    }

    public void setListeImage(List<ImageBean> listeImage) {
        this.listeImage = listeImage;
    }


    public void setCategoryid(int categoryid) {
        this.categoryid = categoryid;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
