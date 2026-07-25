package com.PerfumeStore.PerfumeStore.modules.order.domain;

import com.PerfumeStore.PerfumeStore.shared.domain.LookupEntity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import lombok.Data;

@Entity
@Data
public class PaymentMethod extends LookupEntity {

    @Column(name = "instructions", length = 500)
    private String instructions;

    @Column(name = "account_details")
    private String accountDetails;
}
