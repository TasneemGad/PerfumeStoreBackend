package com.PerfumeStore.PerfumeStore.modules.product.domain;

import com.PerfumeStore.PerfumeStore.shared.domain.LookupEntity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import lombok.Data;


@Entity
@Data
public class ProductSize extends LookupEntity {
    @Column(name = "size_value", nullable = false)
    private String sizeValue; 
}
