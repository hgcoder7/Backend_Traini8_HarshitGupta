package com.traini8.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.traini8.model.TrainingCenter;
import com.traini8.repository.TrainingCenterRepository;
import java.util.List;

@Service
public class TrainingCenterService {
    @Autowired
    private TrainingCenterRepository repository;

    public TrainingCenter saveCenter(TrainingCenter center) {
        return repository.save(center);
    }

    public List<TrainingCenter> getAllCenters() {
        return repository.findAll();
    }
}
