package com.PerfumeStore.PerfumeStore.modules.order.controller;

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

import com.PerfumeStore.PerfumeStore.modules.order.dto.ShippingDetailsDto;
import com.PerfumeStore.PerfumeStore.modules.order.service.ShippingDetailsService;

import io.swagger.v3.oas.annotations.parameters.RequestBody;
import lombok.AllArgsConstructor;

@RestController
@AllArgsConstructor
@RequestMapping("/shipping_details")
public class ShippingDetailsController {

    @Autowired
    private ShippingDetailsService shippingDetailsService;

    @GetMapping
    public ResponseEntity<?> getAll() {
        return ResponseEntity.ok(shippingDetailsService.getAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> getById(@PathVariable("id") Long id) {
        return ResponseEntity.ok(shippingDetailsService.getById(id));
    }

    @PostMapping
    public ResponseEntity<?> save(@RequestBody ShippingDetailsDto dto) {
        ShippingDetailsDto shippingDetailsDto = shippingDetailsService.save(dto);
        return ResponseEntity.created(URI.create("/products/" + shippingDetailsDto.getId())).body(shippingDetailsDto);
    }

    @PutMapping("/{id}")
    public ResponseEntity<?> update(@PathVariable("id") Long id, @RequestBody ShippingDetailsDto dto) {
        shippingDetailsService.update(id, dto);
        return ResponseEntity.ok().build();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> delete(@PathVariable("id") Long id) {
        shippingDetailsService.delete(id);
        return ResponseEntity.noContent().build();
    }
}