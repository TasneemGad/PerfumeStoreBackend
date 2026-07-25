package com.PerfumeStore.PerfumeStore.modules.review.controller;

import java.net.URI;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.PerfumeStore.PerfumeStore.modules.review.dto.ReviewDto;
import com.PerfumeStore.PerfumeStore.modules.review.service.ReviewService;

import lombok.AllArgsConstructor;

@RestController
@AllArgsConstructor
@RequestMapping("/review")
public class ReviewController {

    private ReviewService reviewService;

    @GetMapping
    public ResponseEntity<?> getAll(
            @RequestParam(value = "arabicName", required = false) String arabicName) {
        return ResponseEntity.ok(reviewService.getAll(arabicName));
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> getById(@PathVariable("id") Long id) {
        return ResponseEntity.ok(reviewService.getById(id));
    }

    @PostMapping
    public ResponseEntity<?> save(@RequestBody ReviewDto dto) {
        ReviewDto reviewDto = reviewService.save(dto);
        return ResponseEntity.created(URI.create("/reviews/" + reviewDto.getId())).body(reviewDto);
    }

    @PutMapping("/{id}")
    public ResponseEntity<?> update(@PathVariable("id") Long id, @RequestBody ReviewDto dto) {
        reviewService.update(id, dto);
        return ResponseEntity.ok().build();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> delete(@PathVariable("id") Long id) {
        reviewService.delete(id);
        return ResponseEntity.noContent().build();
    }
}