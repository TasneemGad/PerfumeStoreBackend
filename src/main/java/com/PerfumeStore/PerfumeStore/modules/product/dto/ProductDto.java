package com.PerfumeStore.PerfumeStore.modules.product.dto;

import java.util.List;

import com.PerfumeStore.PerfumeStore.modules.category.domain.Category;
import com.PerfumeStore.PerfumeStore.modules.product.Enum.Gender;
import com.PerfumeStore.PerfumeStore.modules.product.domain.ProductProductSizes;
import com.PerfumeStore.PerfumeStore.modules.product.domain.ProductSize;
import com.PerfumeStore.PerfumeStore.shared.dtos.LookupDto;

import lombok.Data;

@Data
public class ProductDto extends LookupDto {

    private Double price;

    private Integer stockQuantity;

    private String image;

    private Double discountPrice;

    private String description;

    private Category category;

    private Gender gender;

    private List<ProductSize> productSizes;

}
