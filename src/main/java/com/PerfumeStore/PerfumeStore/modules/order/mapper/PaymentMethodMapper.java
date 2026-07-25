package com.PerfumeStore.PerfumeStore.modules.order.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.NullValueCheckStrategy;

import com.PerfumeStore.PerfumeStore.modules.order.domain.PaymentMethod;
import com.PerfumeStore.PerfumeStore.modules.order.dto.PaymentMethodDto;
import com.PerfumeStore.PerfumeStore.shared.mapper.BaseEntityMapper;


@Mapper(componentModel = "spring", nullValueCheckStrategy = NullValueCheckStrategy.ALWAYS)
public interface PaymentMethodMapper extends BaseEntityMapper<PaymentMethod, PaymentMethodDto> {
}
