package com.PerfumeStore.PerfumeStore.modules.review.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.PerfumeStore.PerfumeStore.modules.review.domain.Review;



public interface ReviewRepository extends JpaRepository<Review, Long> {
    @Query(value = """
            SELECT  c FROM Review c
            WHERE (:arabicName IS NULL OR c.arabicName LIKE %:arabicName%)
            """)
    List<Review> findAll(@Param("arabicName") String arabicName);
}
