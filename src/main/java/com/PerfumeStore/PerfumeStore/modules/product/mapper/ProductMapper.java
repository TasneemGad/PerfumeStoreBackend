    package com.PerfumeStore.PerfumeStore.modules.product.mapper;

    import org.mapstruct.Mapper;
    import org.mapstruct.NullValueCheckStrategy;

    import com.PerfumeStore.PerfumeStore.modules.product.domain.Product;
    import com.PerfumeStore.PerfumeStore.modules.product.dto.ProductDto;
    import com.PerfumeStore.PerfumeStore.shared.mapper.BaseEntityMapper;

    @Mapper(componentModel = "spring",nullValueCheckStrategy = NullValueCheckStrategy.ALWAYS)
    public interface ProductMapper extends BaseEntityMapper<Product, ProductDto> {
    }