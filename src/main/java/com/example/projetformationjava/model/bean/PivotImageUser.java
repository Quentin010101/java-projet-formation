package com.example.projetformationjava.model.bean;

import jakarta.persistence.*;

@Entity
@Table(name="pivot_image_user")
public class PivotImageUser {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private long imageid;

    private long userid;

    public PivotImageUser(){

    }
    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }

    public long getImageid() {
        return imageid;
    }

    public void setImageid(long imageid) {
        this.imageid = imageid;
    }

    public long getUserid() {
        return userid;
    }

    public void setUserid(long userid) {
        this.userid = userid;
    }
}
