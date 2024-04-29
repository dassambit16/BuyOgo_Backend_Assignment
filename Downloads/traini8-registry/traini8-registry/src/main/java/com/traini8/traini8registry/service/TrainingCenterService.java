package com.traini8.traini8registry.service;

import com.traini8.traini8registry.exception.DuplicateEmailException;
import com.traini8.traini8registry.model.TrainingCenter;
import com.traini8.traini8registry.repository.TrainingCenterRepository;
import org.springframework.stereotype.Service;

import java.time.Instant;
import java.util.List;

@Service
public class TrainingCenterService {
    private final TrainingCenterRepository trainingCenterRepository;

    public TrainingCenterService(TrainingCenterRepository trainingCenterRepository) {
        this.trainingCenterRepository = trainingCenterRepository;
    }

    public TrainingCenter save(TrainingCenter trainingCenter) {
        String email = trainingCenter.getContactEmail();
        if (trainingCenterRepository.existsByContactEmail(email)) {
            throw new DuplicateEmailException("Email address already exists : " + email);
        }
        String phone = trainingCenter.getContactPhone();
        if (trainingCenterRepository.existsByContactPhone(phone)) {
            throw new DuplicateEmailException("Phone number already exists : " + phone);
        }
        trainingCenter.setCreatedOn(Instant.now());
        return trainingCenterRepository.save(trainingCenter);
    }

    public List<TrainingCenter> getAllTrainingCenters() {
        return trainingCenterRepository.findAll();
    }
}
