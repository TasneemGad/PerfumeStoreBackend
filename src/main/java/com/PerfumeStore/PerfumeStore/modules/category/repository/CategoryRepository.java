package com.PerfumeStore.PerfumeStore.modules.category.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.PerfumeStore.PerfumeStore.modules.category.domain.Category;


public interface CategoryRepository extends JpaRepository<Category, Long> {
    @Query(value = """
            SELECT  c FROM Category c
            WHERE (:arabicName IS NULL OR c.arabicName LIKE %:arabicName%)
            """)
    List<Category> findAll(@Param("arabicName") String arabicName);
}
