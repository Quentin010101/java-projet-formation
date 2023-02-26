package com.example.projetformationjava.model.repository;

import com.example.projetformationjava.model.bean.dao.PivotCategoryImage;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PivotCategoryImageRepository extends JpaRepository<PivotCategoryImage, Long> {
}
