package com.example.projetformationjava.model.repository;

import com.example.projetformationjava.model.bean.CategoryBean;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CategoryRepository extends JpaRepository<CategoryBean, Long> {
    CategoryBean findCategoryBeanByType(String type);
}
