package com.traini8.traini8registry.mapper;

import com.traini8.traini8registry.dto.TrainingCenterDTO;
import com.traini8.traini8registry.model.TrainingCenter;

import java.time.Instant;

public class TrainingCenterMapper {

    public static TrainingCenterDTO toDTO(TrainingCenter trainingCenter) {
        TrainingCenterDTO dto = new TrainingCenterDTO();
        dto.setCenterName(trainingCenter.getCenterName());
        dto.setCenterCode(trainingCenter.getCenterCode());
        dto.setAddress(trainingCenter.getAddress());
        dto.setStudentCapacity(trainingCenter.getStudentCapacity());
        dto.setCoursesOffered(trainingCenter.getCoursesOffered());
        dto.setContactEmail(trainingCenter.getContactEmail());
        dto.setContactPhone(trainingCenter.getContactPhone());
        dto.setCreatedOn(Instant.now());
        return dto;
    }

    public static TrainingCenter toEntity(TrainingCenterDTO dto) {
        TrainingCenter trainingCenter = new TrainingCenter();
        trainingCenter.setCenterName(dto.getCenterName());
        trainingCenter.setCenterCode(dto.getCenterCode());
        trainingCenter.setAddress(dto.getAddress());
        trainingCenter.setStudentCapacity(dto.getStudentCapacity());
        trainingCenter.setCoursesOffered(dto.getCoursesOffered());
        trainingCenter.setContactEmail(dto.getContactEmail());
        trainingCenter.setContactPhone(dto.getContactPhone());
        return trainingCenter;
    }
}
