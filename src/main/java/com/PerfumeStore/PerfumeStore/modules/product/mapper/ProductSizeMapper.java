package com.PerfumeStore.PerfumeStore.modules.product.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.NullValueCheckStrategy;

import com.PerfumeStore.PerfumeStore.modules.product.domain.ProductSize;
import com.PerfumeStore.PerfumeStore.modules.product.dto.ProductSizeDto;
import com.PerfumeStore.PerfumeStore.shared.mapper.BaseEntityMapper;

@Mapper(componentModel = "spring",nullValueCheckStrategy = NullValueCheckStrategy.ALWAYS)
public interface ProductSizeMapper extends BaseEntityMapper<ProductSize, ProductSizeDto> {

}
