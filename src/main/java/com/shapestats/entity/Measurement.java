package com.shapestats.entity;

import java.time.LocalDateTime;
import java.util.UUID;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "measurements")
@Data
public class Measurement {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    private Double weight;
    private Double height;
    private Double bodyFat;

    private Double chest;
    private Double waist;
    private Double hips;
    private Double shoulders;

    private Double rightArm;
    private Double leftArm;

    private Double rightForearm;
    private Double leftForearm;

    private Double rightThigh;
    private Double leftThigh;

    private Double rightCalf;
    private Double leftCalf;

    private LocalDateTime createdAt = LocalDateTime.now();
}

