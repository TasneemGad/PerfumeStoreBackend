package com.PerfumeStore.PerfumeStore.modules.order.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.PerfumeStore.PerfumeStore.modules.order.domain.PaymentMethod;

public interface PaymentMethodRepository extends JpaRepository<PaymentMethod, Long> {

}

