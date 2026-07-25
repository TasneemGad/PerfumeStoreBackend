package com.PerfumeStore.PerfumeStore.modules.order.domain;

import com.PerfumeStore.PerfumeStore.shared.domain.LookupEntity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "shipping_details")
public class ShippingDetails extends LookupEntity {

    @Column(name = "full_name", nullable = false)
    private String fullName;

    @Column(name = "email", nullable = false)
    private String email;

    @Column(name = "phone")
    private String phone;

    @Column(name = "street_address", nullable = false)
    private String streetAddress;
}
