package com.PerfumeStore.PerfumeStore.modules.order.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.PerfumeStore.PerfumeStore.modules.order.service.PaymentStatusService;

import lombok.AllArgsConstructor;

@RestController
@AllArgsConstructor
@RequestMapping("/payment-status")
public class PaymentStatusController {

    private PaymentStatusService paymentStatusService;

    @GetMapping
    public ResponseEntity<?> getAll() {
        return ResponseEntity.ok(paymentStatusService.getAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> getById(@PathVariable("id") Long id) {
        return ResponseEntity.ok(paymentStatusService.getById(id));
    }
}
