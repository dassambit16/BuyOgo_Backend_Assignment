package com.traini8.traini8registry.repository;

import com.traini8.traini8registry.model.TrainingCenter;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface TrainingCenterRepository extends JpaRepository<TrainingCenter, Long> {
    boolean existsByContactEmail(String email);

    boolean existsByContactPhone(String phone);

    Optional<List<TrainingCenter>> findByCenterCode(String centerCode);
}
