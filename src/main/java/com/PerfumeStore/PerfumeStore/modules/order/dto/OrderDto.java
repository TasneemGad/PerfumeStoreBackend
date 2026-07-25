package com.PerfumeStore.PerfumeStore.modules.order.dto;

import java.util.UUID;

import com.PerfumeStore.PerfumeStore.modules.order.domain.PaymentMethod;
import com.PerfumeStore.PerfumeStore.modules.order.domain.PaymentStatus;
import com.PerfumeStore.PerfumeStore.modules.order.domain.ShippingDetails;
import com.PerfumeStore.PerfumeStore.shared.dtos.LookupDto;

import lombok.Data;

@Data
public class OrderDto extends LookupDto {

    private UUID orderNumber;

    private PaymentMethod paymentMethod;

    private PaymentStatus paymentStatus;

    private String transactionReference;

    private ShippingDetails shippingDetails;

}
