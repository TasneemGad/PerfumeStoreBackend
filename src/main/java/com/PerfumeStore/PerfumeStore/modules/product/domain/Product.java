package com.PerfumeStore.PerfumeStore.modules.product.domain;

import java.util.List;

import com.PerfumeStore.PerfumeStore.modules.category.domain.Category;
import com.PerfumeStore.PerfumeStore.modules.product.Enum.Gender;
import com.PerfumeStore.PerfumeStore.shared.domain.LookupEntity;

import jakarta.persistence.*;

import lombok.Data;

@Data
@Entity
public class Product extends LookupEntity {

    @Column(name = "price", nullable = false)
    private Double price;

    @Column(name = "stock_quantity")
    private Integer stockQuantity;

    @Column(name = "image")
    private String image;

    @Column(name = "discount_price")
    private Double discountPrice;

    @Column(name = "description", length = 1000)
    private String description;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "category_id")
    private Category category;

    @Enumerated(EnumType.STRING)
    @Column(name = "gender", nullable = false)
    private Gender gender = Gender.UNISEX;

    @OneToMany(mappedBy = "product", fetch = FetchType.LAZY, cascade = CascadeType.ALL, orphanRemoval = true)
    private List<ProductProductSizes> productSizes ;
}
