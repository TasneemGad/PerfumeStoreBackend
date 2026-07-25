package com.PerfumeStore.PerfumeStore.modules.review.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.NullValueCheckStrategy;

import com.PerfumeStore.PerfumeStore.modules.review.domain.Review;
import com.PerfumeStore.PerfumeStore.modules.review.dto.ReviewDto;
import com.PerfumeStore.PerfumeStore.shared.mapper.BaseEntityMapper;

@Mapper(componentModel = "spring", nullValueCheckStrategy = NullValueCheckStrategy.ALWAYS)
public interface ReviewMapper extends BaseEntityMapper<Review, ReviewDto> {
}