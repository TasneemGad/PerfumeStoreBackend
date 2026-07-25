package com.PerfumeStore.PerfumeStore.shared.dtos;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

@Data
@EqualsAndHashCode(of = {"arabicName", "englishName"}, callSuper = true)
@ToString(of = {"arabicName", "englishName", "enabled"}, callSuper = true)
public class LookupDto extends BaseDto {
    private String arabicName;
    private String englishName;
    private String code;
    private Boolean enabled;
}