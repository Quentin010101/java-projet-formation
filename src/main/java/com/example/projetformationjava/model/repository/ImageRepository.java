package com.example.projetformationjava.model.repository;

import com.example.projetformationjava.model.bean.ImageBean;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface ImageRepository extends JpaRepository<ImageBean, Long> {

    // Permet de recuperer les 9 meilleurs images de la semaine
}
