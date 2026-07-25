package com.PerfumeStore.PerfumeStore.modules.review.dto;

import com.PerfumeStore.PerfumeStore.shared.dtos.LookupDto;

import lombok.Data;

@Data
public class ReviewDto extends LookupDto {
    private String userName;
    private Integer rating;
    private String comment;
}