package com.PerfumeStore.PerfumeStore.modules.order.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.PerfumeStore.PerfumeStore.modules.order.domain.ShippingDetails;
import com.PerfumeStore.PerfumeStore.modules.order.dto.ShippingDetailsDto;
import com.PerfumeStore.PerfumeStore.modules.order.mapper.ShippingDetailsMapper;
import com.PerfumeStore.PerfumeStore.modules.order.repository.ShippingDetailsRepository;
import com.PerfumeStore.PerfumeStore.shared.exception.ResourceNotFoundException;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class ShippingDetailsService {
    private ShippingDetailsRepository shippingDetailsRepository;
    private ShippingDetailsMapper shippingDetailsMapper;

    public List<ShippingDetailsDto> getAll() {
        List<ShippingDetails> products = shippingDetailsRepository.findAll();
        return shippingDetailsMapper.toDto(products);
    }

    public ShippingDetailsDto getById(Long id) {
        ShippingDetails shippingDetails = shippingDetailsRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException(ShippingDetails.class.getSimpleName(), id));
        return shippingDetailsMapper.toDto(shippingDetails);
    }

    public ShippingDetails getReferenceById(Long id) {
        return shippingDetailsRepository.getReferenceById(id);
    }

    public ShippingDetailsDto save(ShippingDetailsDto dto) {
        ShippingDetails shippingDetails = shippingDetailsMapper.toEntity(dto);
        ShippingDetails  savedShippingDetails = shippingDetailsRepository.save(shippingDetails);
        return shippingDetailsMapper.toDto(savedShippingDetails);
    }

    public void update(Long id, ShippingDetailsDto dto) {
        ShippingDetails shippingDetails = shippingDetailsRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException(ShippingDetails.class.getSimpleName(), id));
        ShippingDetails entity = shippingDetailsMapper.updateEntityFromDto(dto, shippingDetails);
        shippingDetailsRepository.save(entity);
    }

    public void delete(Long id) {
        ShippingDetails shippingDetails = shippingDetailsRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException(ShippingDetails.class.getSimpleName(), id));
        shippingDetailsRepository.delete(shippingDetails);
    }
}