package com.example.projetformationjava.model.service;

import com.example.projetformationjava.model.bean.dao.CategoryBean;
import com.example.projetformationjava.model.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryService {

    @Autowired
    private CategoryRepository categoryRep;

    public CategoryBean getCategory(String type){
        return categoryRep.findCategoryBeanByType( type);
    }

    public List<CategoryBean> getCategoryList(){
        return categoryRep.findAll();
    }

    public List<CategoryBean> getTopCategory(){ return categoryRep.topCategory(); }
}
