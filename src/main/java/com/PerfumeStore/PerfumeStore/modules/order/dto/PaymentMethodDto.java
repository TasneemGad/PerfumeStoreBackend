package com.PerfumeStore.PerfumeStore.modules.order.dto;

import com.PerfumeStore.PerfumeStore.shared.dtos.LookupDto;

import lombok.Data;

@Data
public class PaymentMethodDto extends LookupDto {

    private String instructions;

    private String accountDetails;
}
