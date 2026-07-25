package com.PerfumeStore.PerfumeStore.modules.product.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.PerfumeStore.PerfumeStore.modules.product.domain.ProductSize;

public interface ProductSizeRepository extends JpaRepository<ProductSize, Long> {
}
