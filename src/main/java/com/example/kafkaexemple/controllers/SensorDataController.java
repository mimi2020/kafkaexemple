package com.example.kafkaexemple.controllers;


import com.example.kafkaexemple.entities.SensorData;
import com.example.kafkaexemple.services.SensorDataService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/SensorData")
public class SensorDataController {
    private SensorDataService sensorDataService;

    public SensorDataController(SensorDataService sensorDataService) {
        this.sensorDataService = sensorDataService;
    }

    @GetMapping("/all")
    public ResponseEntity<List<SensorData>> getAll(){
      List<SensorData> sensors=this.sensorDataService.findAllSensors();
      return ResponseEntity.ok(sensors);
    }
}
