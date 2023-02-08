package com.example.projetformationjava.model.repository;

import com.example.projetformationjava.model.bean.CategoryBean;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface CategoryRepository extends JpaRepository<CategoryBean, Long> {
    CategoryBean findCategoryBeanByType(String type);

    @Query("SELECT cat FROM PivotImageUser p INNER JOIN PivotCategoryImage c ON p.imageid = c.imageid INNER JOIN CategoryBean cat ON c.categoryid = cat.categoryid GROUP BY c.categoryid ORDER BY COUNT(c.categoryid) DESC LIMIT 3")
    List<CategoryBean> topCategory();
}
