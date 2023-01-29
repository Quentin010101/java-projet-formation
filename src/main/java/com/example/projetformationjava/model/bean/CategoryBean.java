package com.example.projetformationjava.model.bean;

import java.util.List;

public class CategoryBean {
    private int categoryid;
    private String type;
    private List<ImageBean> listeImage;

    public List<ImageBean> getListeImage() {
        return listeImage;
    }

    public void setListeImage(List<ImageBean> listeImage) {
        this.listeImage = listeImage;
    }

    public int getCategoryid() {
        return categoryid;
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
