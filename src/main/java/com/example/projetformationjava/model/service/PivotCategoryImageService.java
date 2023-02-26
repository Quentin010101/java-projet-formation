package com.example.projetformationjava.model.service;

import com.example.projetformationjava.model.bean.dao.PivotCategoryImage;
import com.example.projetformationjava.model.repository.PivotCategoryImageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PivotCategoryImageService {

    @Autowired
    private PivotCategoryImageRepository PivotCatImgRep;

    public void addCategoryToImage(PivotCategoryImage pci){
        this.PivotCatImgRep.save(pci);
    }
}
