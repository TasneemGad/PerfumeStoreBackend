package com.PerfumeStore.PerfumeStore.modules.order.domain;

import com.PerfumeStore.PerfumeStore.shared.domain.LookupEntity;

import jakarta.persistence.Entity;
import lombok.Data;

@Entity
@Data
public class PaymentStatus extends LookupEntity {
}
