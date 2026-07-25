package com.PerfumeStore.PerfumeStore.modules.product.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.PerfumeStore.PerfumeStore.modules.product.Enum.Gender;
import com.PerfumeStore.PerfumeStore.modules.product.domain.Product;
import com.PerfumeStore.PerfumeStore.modules.product.dto.ProductDto;
import com.PerfumeStore.PerfumeStore.modules.product.mapper.ProductMapper;
import com.PerfumeStore.PerfumeStore.modules.product.repository.ProductRepository;
import com.PerfumeStore.PerfumeStore.shared.exception.ResourceNotFoundException;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class ProductService {
    private ProductRepository productRepository;
    private ProductMapper productMapper;

    public List<ProductDto> getAll(String arabicName , Gender gender) {
        List<Product> products = productRepository.findAll(arabicName , gender);
        return productMapper.toDto(products);
    }

    public ProductDto getById(Long id) {
        Product product = productRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException(Product.class.getSimpleName(), id));
        return productMapper.toDto(product);
    }

    public Product getReferenceById(Long id) {
        return productRepository.getReferenceById(id);
    }

    public ProductDto save(ProductDto dto) {
        Product product = productMapper.toEntity(dto);
        Product savedProduct = productRepository.save(product);
        return productMapper.toDto(savedProduct);
    }

    public void update(Long id, ProductDto dto) {
        Product product = productRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException(Product.class.getSimpleName(), id));
        Product entity = productMapper.updateEntityFromDto(dto, product);
        productRepository.save(entity);
    }

    public void delete(Long id) {
        Product product = productRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException(Product.class.getSimpleName(), id));
        productRepository.delete(product);
    }
}