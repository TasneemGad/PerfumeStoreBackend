package com.PerfumeStore.PerfumeStore.modules.order.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.PerfumeStore.PerfumeStore.modules.order.domain.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}

