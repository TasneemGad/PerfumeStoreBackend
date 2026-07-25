package com.PerfumeStore.PerfumeStore.modules.order.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.PerfumeStore.PerfumeStore.modules.order.domain.PaymentMethod;
import com.PerfumeStore.PerfumeStore.modules.order.dto.PaymentMethodDto;
import com.PerfumeStore.PerfumeStore.modules.order.mapper.PaymentMethodMapper;
import com.PerfumeStore.PerfumeStore.modules.order.repository.PaymentMethodRepository;
import com.PerfumeStore.PerfumeStore.shared.exception.ResourceNotFoundException;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class PaymentMethodService {

    private PaymentMethodRepository paymentMethodRepository;
    private PaymentMethodMapper paymentMethodMapper;

    public List<PaymentMethodDto> getAll() {
        List<PaymentMethod> paymentMethod = paymentMethodRepository.findAll();
        return paymentMethodMapper.toDto(paymentMethod);
    }

    public PaymentMethodDto getById(Long id) {
        PaymentMethod paymentMethod = paymentMethodRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException(PaymentMethod.class.getSimpleName(), id.toString()));
        return paymentMethodMapper.toDto(paymentMethod);
    }

    public PaymentMethod getReferenceById(Long id) {
        return paymentMethodRepository.getReferenceById(id);
    }
}
