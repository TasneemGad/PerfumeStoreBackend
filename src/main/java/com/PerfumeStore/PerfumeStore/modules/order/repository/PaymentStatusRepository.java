package com.PerfumeStore.PerfumeStore.modules.order.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.PerfumeStore.PerfumeStore.modules.order.domain.PaymentStatus;

public interface PaymentStatusRepository extends JpaRepository<PaymentStatus, Long> {

}

