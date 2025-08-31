package com.shapestats.dto;

import java.time.LocalDateTime;
import java.util.UUID;

public record MeasurementResponseDTO(
        UUID id,
        Double weight,
        Double height,
        Double chest,
        Double waist,
        Double hips,
        Double shoulders,
        Double rightArm,
        Double leftArm,
        Double rightForearm,
        Double leftForearm,
        Double rightThigh,
        Double leftThigh,
        Double rightCalf,
        Double leftCalf,
        LocalDateTime createdAt
) {}
