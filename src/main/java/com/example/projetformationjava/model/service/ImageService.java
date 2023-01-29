package com.example.projetformationjava.model.service;

import com.example.projetformationjava.model.bean.CategoryBean;
import com.example.projetformationjava.model.bean.ImageBean;

import java.util.ArrayList;
import java.util.List;

public class ImageService {

    public static List<ImageBean> getTopImage(){
        List<ImageBean> liste = new ArrayList<>();
        String[] imagePath = {
                "f91f2f13-922e-4b55-b4d7-1a7b7451c6e9.png",
                "d994687e-4fa0-4fc4-acec-997dd6bfd1d1.jpg",
                "bfedebb1-2fda-475f-aa29-45c8f8d72b39.jpg",
                "18750097-6aac-40e1-93e2-39dae8dcc1f5.jpg",
                "34591cf3-c941-4a75-8a7e-d1eb6d446e0b.jpg",
                "9227f9bb-7b07-4d09-be55-2d19851ee187.jpg",
                "8898dbcf-3c07-4526-9138-7974f515d21f.jpg",
                "06046f29-650f-4a73-8988-8afacd07fa1f.jpg",
                "5897c478-3ecd-4384-b776-e7c3fc8fad5e.jpg"
        };

        for(int i = 0; i< 9; i++){
            ImageBean image = new ImageBean();
            image.setTitle("Hello title");
            image.setDescription("cool description");
            image.setImagePath("http://localhost:8080/image/" + imagePath[i]);
            image.setImageid(i);
            liste.add(image);
        }

        return liste;
    }

    public static List<CategoryBean> getTopCategory(){
        List<CategoryBean> liste = new ArrayList<>();

        String[] type = {"Nature", "Technologie", "Paysage"};

        for(int i = 0; i< 3; i++){
            List<ImageBean> listeImage = new ArrayList<>();
            String[] imagePath = {
                    "f91f2f13-922e-4b55-b4d7-1a7b7451c6e9.png",
                    "d994687e-4fa0-4fc4-acec-997dd6bfd1d1.jpg",
                    "bfedebb1-2fda-475f-aa29-45c8f8d72b39.jpg",
            };

            for(int j = 0; j< 3; j++){
                ImageBean image = new ImageBean();
                image.setTitle("Hello title");
                image.setDescription("cool description");
                image.setImagePath("http://localhost:8080/image/" + imagePath[j]);
                image.setImageid(i);
                listeImage.add(image);
            }

            CategoryBean category = new CategoryBean();
            category.setType(type[i]);
            category.setListeImage(listeImage);
            liste.add(category);
        }

        return liste;
    }
}
