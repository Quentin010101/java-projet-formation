package com.example.projetformationjava.model.service;

import com.example.projetformationjava.model.bean.ImageBean;
import com.example.projetformationjava.model.repository.ImageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ImageService {

    @Autowired
    private ImageRepository imageRepository;

    // Permet de recuperer les 9 meilleurs images de la semaine
    public List<ImageBean> getTopImage(){
            return imageRepository.topImage();
    }
}
