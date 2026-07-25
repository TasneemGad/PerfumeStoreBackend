package com.PerfumeStore.PerfumeStore.modules.order.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.NullValueCheckStrategy;

import com.PerfumeStore.PerfumeStore.modules.order.domain.ShippingDetails;
import com.PerfumeStore.PerfumeStore.modules.order.dto.ShippingDetailsDto;
import com.PerfumeStore.PerfumeStore.shared.mapper.BaseEntityMapper;

@Mapper(componentModel = "spring", nullValueCheckStrategy = NullValueCheckStrategy.ALWAYS)
public interface ShippingDetailsMapper extends BaseEntityMapper<ShippingDetails, ShippingDetailsDto> {
}
