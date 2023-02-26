package com.example.projetformationjava.model.bean.dao;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity
@Table(name="image")
@Getter
@Setter
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

    @OneToMany(mappedBy = "imageid",fetch = FetchType.EAGER)
    private List<PivotImageUser> like;

    @Override
    public String toString() {
        return "ImageBean{" +
                "imageid=" + imageid +
                ", imagePath='" + imagePath + '\'' +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", user=" + user +
                ", like=" + like +
                '}';
    }
}
