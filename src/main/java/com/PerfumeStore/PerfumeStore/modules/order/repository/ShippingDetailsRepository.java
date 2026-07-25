package com.PerfumeStore.PerfumeStore.modules.order.repository;
import org.springframework.data.jpa.repository.JpaRepository;

import com.PerfumeStore.PerfumeStore.modules.order.domain.ShippingDetails;

public interface ShippingDetailsRepository extends JpaRepository<ShippingDetails, Long> {

}
