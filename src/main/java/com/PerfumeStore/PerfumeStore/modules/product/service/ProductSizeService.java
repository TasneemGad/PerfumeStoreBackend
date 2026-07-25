package com.PerfumeStore.PerfumeStore.modules.product.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.PerfumeStore.PerfumeStore.modules.product.Enum.Gender;
import com.PerfumeStore.PerfumeStore.modules.product.domain.ProductSize;
import com.PerfumeStore.PerfumeStore.modules.product.dto.ProductSizeDto;
import com.PerfumeStore.PerfumeStore.modules.product.mapper.ProductSizeMapper;
import com.PerfumeStore.PerfumeStore.modules.product.repository.ProductSizeRepository;
import com.PerfumeStore.PerfumeStore.shared.exception.ResourceNotFoundException;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class ProductSizeService {
    private ProductSizeRepository productSizeRepository;
    private ProductSizeMapper productSizeMapper;

    public List<ProductSizeDto> getAll() {
        List<ProductSize> productSizes = productSizeRepository.findAll();
        return productSizeMapper.toDto(productSizes);
    }

    public ProductSizeDto getById(Long id) {
        ProductSize productSize = productSizeRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException(ProductSize.class.getSimpleName(), id));
        return productSizeMapper.toDto(productSize);
    }

    public ProductSize getReferenceById(Long id) {
        return productSizeRepository.getReferenceById(id);
    }

    public ProductSizeDto save(ProductSizeDto dto) {
        ProductSize productSize = productSizeMapper.toEntity(dto);
        ProductSize savedProductSize = productSizeRepository.save(productSize);
        return productSizeMapper.toDto(savedProductSize);
    }

    public void update(Long id, ProductSizeDto dto) {
        ProductSize productSize = productSizeRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException(ProductSize.class.getSimpleName(), id));
        ProductSize entity = productSizeMapper.updateEntityFromDto(dto, productSize);
        productSizeRepository.save(entity);
    }

    public void delete(Long id) {
        ProductSize productSize = productSizeRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException(ProductSize.class.getSimpleName(), id));
        productSizeRepository.delete(productSize);
    }
}