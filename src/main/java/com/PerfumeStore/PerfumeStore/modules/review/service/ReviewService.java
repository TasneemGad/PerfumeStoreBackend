package com.PerfumeStore.PerfumeStore.modules.review.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.PerfumeStore.PerfumeStore.modules.review.domain.Review;
import com.PerfumeStore.PerfumeStore.modules.review.dto.ReviewDto;
import com.PerfumeStore.PerfumeStore.modules.review.mapper.ReviewMapper;
import com.PerfumeStore.PerfumeStore.modules.review.repository.ReviewRepository;
import com.PerfumeStore.PerfumeStore.shared.exception.ResourceNotFoundException;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class ReviewService {
    private ReviewRepository reviewRepository;
    private ReviewMapper reviewMapper;

    public List<ReviewDto> getAll(String arabicName) {
        List<Review> reviews = reviewRepository.findAll(arabicName);
        return reviewMapper.toDto(reviews);
    }

    public ReviewDto getById(Long id) {
        Review review = reviewRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException(Review.class.getSimpleName(), id));
        return reviewMapper.toDto(review);
    }

    public Review getReferenceById(Long id) {
        return reviewRepository.getReferenceById(id);
    }

    public ReviewDto save(ReviewDto dto) {
        Review review = reviewMapper.toEntity(dto);
        Review savedReview = reviewRepository.save(review);
        return reviewMapper.toDto(savedReview);
    }

    public void update(Long id, ReviewDto dto) {
        Review review = reviewRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException(Review.class.getSimpleName(), id));
        Review entity = reviewMapper.updateEntityFromDto(dto, review);
        reviewRepository.save(entity);
    }

    public void delete(Long id) {
        Review review = reviewRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException(Review.class.getSimpleName(), id));
        reviewRepository.delete(review);
    }
}