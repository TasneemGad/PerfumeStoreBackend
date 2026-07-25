package com.PerfumeStore.PerfumeStore.modules.order.dto;

import com.PerfumeStore.PerfumeStore.shared.dtos.LookupDto;

import lombok.Data;


@Data
public class ShippingDetailsDto extends LookupDto {

    private String fullName;

    private String email;

    private String phone;

    private String streetAddress;
}
