package com.PerfumeStore.PerfumeStore.modules.order.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.PerfumeStore.PerfumeStore.modules.order.domain.PaymentStatus;
import com.PerfumeStore.PerfumeStore.modules.order.dto.PaymentStatusDto;
import com.PerfumeStore.PerfumeStore.modules.order.mapper.PaymentStatusMapper;
import com.PerfumeStore.PerfumeStore.modules.order.repository.PaymentStatusRepository;
import com.PerfumeStore.PerfumeStore.shared.exception.ResourceNotFoundException;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class PaymentStatusService {

    private PaymentStatusRepository paymentStatusRepository;
    private PaymentStatusMapper paymentStatusMapper;

    public List<PaymentStatusDto> getAll() {
        List<PaymentStatus> paymentStatus = paymentStatusRepository.findAll();
        return paymentStatusMapper.toDto(paymentStatus);
    }

    public PaymentStatusDto getById(Long id) {
        PaymentStatus PaymentStatus = paymentStatusRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException(PaymentStatus.class.getSimpleName(), id.toString()));
        return paymentStatusMapper.toDto(PaymentStatus);
    }

    public PaymentStatus getReferenceById(Long id) {
        return paymentStatusRepository.getReferenceById(id);
    }
}
