package com.shapestats.repository;

import com.shapestats.entity.Measurement;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.UUID;

public interface MeasurementRepository extends JpaRepository<Measurement, UUID> {
    List<Measurement> findByUserId(UUID userId);
}
