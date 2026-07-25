package com.PerfumeStore.PerfumeStore.modules.product.controller;

import java.net.URI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.PerfumeStore.PerfumeStore.modules.product.dto.ProductSizeDto;
import com.PerfumeStore.PerfumeStore.modules.product.service.ProductSizeService;

import io.swagger.v3.oas.annotations.parameters.RequestBody;
import lombok.AllArgsConstructor;

@RestController
@AllArgsConstructor
@RequestMapping("/product-size")
public class ProductSizeController {

    @Autowired
    private ProductSizeService productSizeService;

    @GetMapping
    public ResponseEntity<?> getAll() {
        return ResponseEntity.ok(productSizeService.getAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> getById(@PathVariable("id") Long id) {
        return ResponseEntity.ok(productSizeService.getById(id));
    }

    @PostMapping
    public ResponseEntity<?> save(@RequestBody ProductSizeDto dto) {
        ProductSizeDto productSizeDto = productSizeService.save(dto);
        return ResponseEntity.created(URI.create("/product-sizes/" + productSizeDto.getId())).body(productSizeDto);
    }

    @PutMapping("/{id}")
    public ResponseEntity<?> update(@PathVariable("id") Long id, @RequestBody ProductSizeDto dto) {
        productSizeService.update(id, dto);
        return ResponseEntity.ok().build();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> delete(@PathVariable("id") Long id) {
        productSizeService.delete(id);
        return ResponseEntity.noContent().build();
    }
}
