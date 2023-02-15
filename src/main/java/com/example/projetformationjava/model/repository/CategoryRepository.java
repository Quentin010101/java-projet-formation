package com.example.projetformationjava.model.repository;

import com.example.projetformationjava.model.bean.dao.CategoryBean;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface CategoryRepository extends JpaRepository<CategoryBean, Long> {

    // Permet de recuperer une category
    CategoryBean findCategoryBeanByType(String type);

    // Permet de recuperer les 3 meilleurs category
    @Query("SELECT cat FROM PivotImageUser p INNER JOIN PivotCategoryImage c ON p.imageid = c.imageid INNER JOIN CategoryBean cat ON c.categoryid = cat.categoryid GROUP BY c.categoryid ORDER BY COUNT(c.categoryid) DESC LIMIT 3")
    List<CategoryBean> topCategory();
}
