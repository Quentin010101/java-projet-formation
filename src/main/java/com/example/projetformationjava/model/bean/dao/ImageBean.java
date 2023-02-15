package com.example.projetformationjava.model.bean.dao;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name="image")
public class ImageBean {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long imageid;
    private String imagePath;
    private String title;
    private String description;

    @ManyToOne(fetch = FetchType.EAGER) // Eager valeur par default
    @JoinColumn(name="userid", referencedColumnName = "userid")
    private UserBean user;

//    @OneToMany(fetch = FetchType.EAGER) // Eager valeur par default
//    @JoinColumn(name="imageid", referencedColumnName = "imageid")
    @OneToMany(mappedBy = "imageid",fetch = FetchType.EAGER)
    private List<PivotImageUser> like;

    public UserBean getUser() {
        return user;
    }

    public void setUser(UserBean user) {
        this.user = user;
    }

    public int getLike(){
        return like.size();
    }

    public ImageBean() {
    }

    public ImageBean(String imagePath, String title, String description) {
        this.imagePath = imagePath;
        this.title = title;
        this.description = description;
    }
    public void setImageid(int imageid) {
        this.imageid = imageid;
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
