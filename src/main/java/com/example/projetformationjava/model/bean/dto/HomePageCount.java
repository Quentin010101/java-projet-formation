package com.example.projetformationjava.model.bean.dto;

public class HomePageCount {

    private long nbImages;
    private long nbCategories;
    private long nbUsers;

    public HomePageCount() {
    }

    public HomePageCount(long nbImages, long nbCategories, long nbUsers) {
        this.nbImages = nbImages;
        this.nbCategories = nbCategories;
        this.nbUsers = nbUsers;
    }

    public long getNbImages() {
        return nbImages;
    }

    public void setNbImages(long nbImages) {
        this.nbImages = nbImages;
    }

    public long getNbCategories() {
        return nbCategories;
    }

    public void setNbCategories(long nbCategories) {
        this.nbCategories = nbCategories;
    }

    public long getNbUsers() {
        return nbUsers;
    }

    public void setNbUsers(long nbUsers) {
        this.nbUsers = nbUsers;
    }
}
