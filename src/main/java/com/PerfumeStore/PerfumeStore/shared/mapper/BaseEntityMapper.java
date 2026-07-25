package com.PerfumeStore.PerfumeStore.shared.mapper;

import java.util.List;

import com.PerfumeStore.PerfumeStore.shared.domain.BaseEntity;
import com.PerfumeStore.PerfumeStore.shared.dtos.BaseDto;
import org.mapstruct.MappingTarget;

public interface BaseEntityMapper<T extends BaseEntity, S extends BaseDto> {
    T toEntity(S s);

    S toDto(T t);

    List<T> toEntity(List<S> dtoList);

    List<S> toDto(List<T> dtoList);

    T updateEntityFromDto(S s, @MappingTarget T t);
}