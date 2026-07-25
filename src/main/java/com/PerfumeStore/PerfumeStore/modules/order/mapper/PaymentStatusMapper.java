package com.PerfumeStore.PerfumeStore.modules.order.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.NullValueCheckStrategy;

import com.PerfumeStore.PerfumeStore.modules.order.domain.PaymentStatus;
import com.PerfumeStore.PerfumeStore.modules.order.dto.PaymentStatusDto;
import com.PerfumeStore.PerfumeStore.shared.mapper.BaseEntityMapper;


@Mapper(componentModel = "spring", nullValueCheckStrategy = NullValueCheckStrategy.ALWAYS)
public interface PaymentStatusMapper extends BaseEntityMapper<PaymentStatus, PaymentStatusDto> {
}
