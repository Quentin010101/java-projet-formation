package com.example.projetformationjava.model.repository;

import com.example.projetformationjava.model.bean.ImageBean;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ImageRepository extends JpaRepository<ImageBean, Long> {

    // Permet de recuperer les 9 meilleurs images de la semaine
    @Query("SELECT i from PivotImageUser p INNER JOIN ImageBean i On p.imageid = i.imageid group by p.imageid ORDER BY COUNT(p.imageid) DESC LIMIT 9")
    List<ImageBean> topImage();
}
