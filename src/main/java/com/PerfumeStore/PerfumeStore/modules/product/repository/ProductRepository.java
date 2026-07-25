package com.PerfumeStore.PerfumeStore.modules.product.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.PerfumeStore.PerfumeStore.modules.product.Enum.Gender;
import com.PerfumeStore.PerfumeStore.modules.product.domain.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

    @Query("SELECT p FROM Product p WHERE "
            + "(:arabicName IS NULL OR p.arabicName LIKE CONCAT('%', :arabicName, '%')) AND "
            + "(:gender IS NULL OR p.gender = :gender)")
    List<Product> findAll(String arabicName, Gender gender);
}
