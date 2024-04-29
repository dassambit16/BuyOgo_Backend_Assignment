package com.traini8.traini8registry.repository;

import com.traini8.traini8registry.model.TrainingCenter;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TrainingCenterRepository extends JpaRepository<TrainingCenter, Long> {
    boolean existsByContactEmail(String email);

    boolean existsByContactPhone(String phone);
}
