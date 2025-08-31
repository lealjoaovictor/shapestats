package com.shapestats.dto;

public record MeasurementRequestDTO(
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
        Double leftCalf
) {}
