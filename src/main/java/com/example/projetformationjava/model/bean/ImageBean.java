package com.example.projetformationjava.model.bean;


public class ImageBean {

    private int imageid;
    private int userid;
    private String imagePath;
    private String title;
    private String description;

    public ImageBean() {
    }

    public ImageBean(String imagePath, String title, String description) {
        this.imagePath = imagePath;
        this.title = title;
        this.description = description;
    }

    public int getImageid() {
        return imageid;
    }

    public void setImageid(int imageid) {
        this.imageid = imageid;
    }

    public int getUserid() {
        return userid;
    }

    public void setUserid(int userid) {
        this.userid = userid;
    }

    public String getImagePath() {
        return imagePath;
    }

    public void setImagePath(String imagePath) {
        this.imagePath = imagePath;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
