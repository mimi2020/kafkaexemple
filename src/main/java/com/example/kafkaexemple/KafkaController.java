package com.example.kafkaexemple;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/kafka")
public class KafkaController {

    @Autowired
    private KafkaProducerService   producerService;

    @GetMapping("/publish")
    public ResponseEntity<String> publish(@RequestParam String message){
        this.producerService.sendMessage(message);
        return ResponseEntity.ok("message send to kafka"+message);
    }
}
