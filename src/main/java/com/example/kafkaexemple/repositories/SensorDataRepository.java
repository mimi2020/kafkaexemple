package com.example.kafkaexemple.repositories;


import com.example.kafkaexemple.entities.SensorData;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SensorDataRepository extends JpaRepository<SensorData,Integer> {
}
