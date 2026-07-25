    package com.PerfumeStore.PerfumeStore.modules.category.mapper;

    import org.mapstruct.Mapper;
    import org.mapstruct.NullValueCheckStrategy;

import com.PerfumeStore.PerfumeStore.modules.category.domain.Category;
import com.PerfumeStore.PerfumeStore.modules.category.dto.CategoryDto;
    import com.PerfumeStore.PerfumeStore.shared.mapper.BaseEntityMapper;

    @Mapper(componentModel = "spring",nullValueCheckStrategy = NullValueCheckStrategy.ALWAYS)
    public interface CategoryMapper extends BaseEntityMapper<Category, CategoryDto> {
    }