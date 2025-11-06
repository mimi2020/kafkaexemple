package com.example.kafkaexemple.services;


import com.example.kafkaexemple.entities.SensorData;
import com.example.kafkaexemple.repositories.SensorDataRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SensorDataService {
    private SensorDataRepository sensorDataRepository;

    public SensorDataService(SensorDataRepository sensorDataRepository) {
        this.sensorDataRepository = sensorDataRepository;
    }

    public List<SensorData> findAllSensors(){
        return this.sensorDataRepository.findAll();
    }
}
