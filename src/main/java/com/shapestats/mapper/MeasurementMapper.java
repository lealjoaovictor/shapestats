package com.shapestats.mapper;

import com.shapestats.dto.*;
import com.shapestats.entity.Measurement;

public class MeasurementMapper {

    public static Measurement toEntity(MeasurementRequestDTO dto) {
        Measurement m = new Measurement();
        m.setWeight(dto.weight());
        m.setHeight(dto.height());
        m.setChest(dto.chest());
        m.setWaist(dto.waist());
        m.setHips(dto.hips());
        m.setShoulders(dto.shoulders());
        m.setRightArm(dto.rightArm());
        m.setLeftArm(dto.leftArm());
        m.setRightForearm(dto.rightForearm());
        m.setLeftForearm(dto.leftForearm());
        m.setRightThigh(dto.rightThigh());
        m.setLeftThigh(dto.leftThigh());
        m.setRightCalf(dto.rightCalf());
        m.setLeftCalf(dto.leftCalf());
        return m;
    }

    public static MeasurementResponseDTO toDTO(Measurement m) {
        return new MeasurementResponseDTO(
                m.getId(),
                m.getWeight(),
                m.getHeight(),
                m.getChest(),
                m.getWaist(),
                m.getHips(),
                m.getShoulders(),
                m.getRightArm(),
                m.getLeftArm(),
                m.getRightForearm(),
                m.getLeftForearm(),
                m.getRightThigh(),
                m.getLeftThigh(),
                m.getRightCalf(),
                m.getLeftCalf(),
                m.getCreatedAt()
        );
    }
}
