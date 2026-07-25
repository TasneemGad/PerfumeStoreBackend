package com.PerfumeStore.PerfumeStore.modules.review.domain;

import com.PerfumeStore.PerfumeStore.shared.domain.LookupEntity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import lombok.Data;

@Data
@Entity
public class Review extends LookupEntity {
    @Column(name = "user_name")
    private String userName;
    @Column(name = "rating")
    private Integer rating;
    @Column(name = "comment", length = 1000)
    private String comment;
}
