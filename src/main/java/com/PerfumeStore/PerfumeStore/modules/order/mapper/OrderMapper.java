package com.PerfumeStore.PerfumeStore.modules.order.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.NullValueCheckStrategy;

import com.PerfumeStore.PerfumeStore.modules.order.domain.Order;
import com.PerfumeStore.PerfumeStore.modules.order.dto.OrderDto;
import com.PerfumeStore.PerfumeStore.shared.mapper.BaseEntityMapper;


@Mapper(componentModel = "spring", nullValueCheckStrategy = NullValueCheckStrategy.ALWAYS)
public interface OrderMapper extends BaseEntityMapper<Order, OrderDto> {
}
