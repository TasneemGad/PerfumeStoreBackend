package com.PerfumeStore.PerfumeStore.modules.product.dto;

import com.PerfumeStore.PerfumeStore.modules.product.domain.Product;
import com.PerfumeStore.PerfumeStore.modules.product.domain.ProductSize;
import com.PerfumeStore.PerfumeStore.shared.dtos.LookupDto;

import lombok.Data;

@Data
public class ProductProductSizesDto extends LookupDto {

    private Product product;

    private ProductSize productSize;
}
