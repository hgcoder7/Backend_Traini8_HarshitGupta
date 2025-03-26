package com.traini8.controller;

//Controller

import org.springframework.web.bind.annotation.*;
import org.springframework.http.ResponseEntity;
import org.springframework.http.HttpStatus;
import org.springframework.validation.annotation.Validated;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import com.traini8.model.TrainingCenter;
import com.traini8.service.TrainingCenterService;
import java.util.List;

@RestController
@RequestMapping("/api/training-centers")
@Validated
public class TrainingCenterController {
 @Autowired
 private TrainingCenterService service;

 @PostMapping
 public ResponseEntity<TrainingCenter> createTrainingCenter(@Valid @RequestBody TrainingCenter center) {
     return new ResponseEntity<>(service.saveCenter(center), HttpStatus.CREATED);
 }

 @GetMapping
 public ResponseEntity<List<TrainingCenter>> getAllTrainingCenters() {
     return ResponseEntity.ok(service.getAllCenters());
 }
}
