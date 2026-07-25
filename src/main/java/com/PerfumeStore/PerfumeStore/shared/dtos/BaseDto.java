package com.PerfumeStore.PerfumeStore.shared.dtos;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

@Data
@EqualsAndHashCode(of = "id", callSuper = false)
@ToString(of = "id")
public class BaseDto {
    private Long id;
}