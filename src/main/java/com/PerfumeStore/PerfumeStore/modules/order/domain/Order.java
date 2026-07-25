package com.PerfumeStore.PerfumeStore.modules.order.domain;

import java.util.UUID;

import com.PerfumeStore.PerfumeStore.shared.domain.LookupEntity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import lombok.Data;

@Entity
@Data
public class Order extends LookupEntity {

    @Column(name = "order_number", nullable = false, unique = true, updatable = false)
    private UUID orderNumber;

    @Column(name = "transaction_reference")
    private String transactionReference;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "payment_method_id", nullable = false)
    private PaymentMethod paymentMethod;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "payment_status_id", nullable = false)
    private PaymentStatus paymentStatus;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "shipping_details_id")
    private ShippingDetails shippingDetails;
}
