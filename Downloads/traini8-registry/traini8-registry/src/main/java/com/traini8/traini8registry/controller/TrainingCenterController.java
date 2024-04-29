package com.traini8.traini8registry.controller;

import com.traini8.traini8registry.dto.TrainingCenterDTO;
import com.traini8.traini8registry.mapper.TrainingCenterMapper;
import com.traini8.traini8registry.model.TrainingCenter;
import com.traini8.traini8registry.service.TrainingCenterService;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Validated
@RequestMapping("/api/")
public class TrainingCenterController {
    private final TrainingCenterService trainingCenterService;

    public TrainingCenterController(TrainingCenterService trainingCenterService) {
        this.trainingCenterService = trainingCenterService;
    }

    @PostMapping("/training-centers")
    public ResponseEntity<?> createTrainingCenter(@Valid @RequestBody TrainingCenterDTO trainingCenterDTO) {
        try {
            TrainingCenter trainingCenter = TrainingCenterMapper.toEntity(trainingCenterDTO);
            TrainingCenter savedTrainingCenter = trainingCenterService.save(trainingCenter);
            TrainingCenterDTO savedTrainingCenterDTO = TrainingCenterMapper.toDTO(savedTrainingCenter);
            return new ResponseEntity<>(savedTrainingCenterDTO, HttpStatus.CREATED);
        } catch (Exception ex) {
            return new ResponseEntity<>(ex.getMessage(), HttpStatus.BAD_REQUEST);
        }
    }


    @GetMapping("/training-centers")
    public ResponseEntity<List<TrainingCenter>> getAllTrainingCenters() {
        try {
            List<TrainingCenter> trainingCenters = trainingCenterService.getAllTrainingCenters();
            return ResponseEntity.ok(trainingCenters);
        } catch (Exception ex) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(List.of());
        }
    }

}
