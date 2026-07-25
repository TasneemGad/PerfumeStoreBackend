package com.PerfumeStore.PerfumeStore.modules.product.dto;

import com.PerfumeStore.PerfumeStore.shared.dtos.LookupDto;

import lombok.Data;

@Data
public class ProductSizeDto extends LookupDto {
    private String sizeValue; 
}
