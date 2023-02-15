package com.example.projetformationjava.model.service;

import com.example.projetformationjava.model.bean.dao.ImageBean;
import com.example.projetformationjava.model.bean.dao.UserBean;
import com.example.projetformationjava.model.repository.ImageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ImageService {

    @Autowired
    private ImageRepository imageRepository;

    // Get Top 9 Images
    public List<ImageBean> getTopImage(){
        return imageRepository.topImage();
    }

    // Get User Images
    public List<ImageBean> getFeed(UserBean user){
        return imageRepository.getImageBeansByUser(user);
    }

    // Save image
    public void saveImage(ImageBean image){
        imageRepository.save(image);
    }

}
