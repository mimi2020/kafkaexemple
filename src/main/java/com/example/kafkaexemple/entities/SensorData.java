package com.example.kafkaexemple.entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;

import java.sql.Timestamp;

@Entity
@Table(name="sensor_data")
public class SensorData {
    @Id
    @GeneratedValue(strategy =GenerationType.IDENTITY )
    @NotBlank(message="sensor ID can not be blank")
    @Pattern(
            regexp = "^\\d+$",
            message = "Invalid Sensor ID format"
    )
    private Integer sensorId;
    @NotBlank (message="Temperature can not be blank")
    private Double temperature;
    @NotBlank(message = "Time cannot be blank")
    private Timestamp time;


    public @NotBlank(message = "sensor ID can not be blank") @Pattern(
            regexp = "^\\d+$",
            message = "Invalid Sensor ID format"
    ) Integer getSensorId() {
        return sensorId;
    }

    public void setSensorId(@NotBlank(message = "sensor ID can not be blank") @Pattern(
            regexp = "^\\d+$",
            message = "Invalid Sensor ID format"
    ) Integer sensorId) {
        this.sensorId = sensorId;
    }

    public @NotBlank(message = "Temperature can not be blank") Double getTemperature() {
        return temperature;
    }

    public void setTemperature(@NotBlank(message = "Temperature can not be blank") Double temperature) {
        this.temperature = temperature;
    }

    public @NotBlank(message = "Time cannot be blank") Timestamp getTime() {
        return time;
    }

    public void setTime(@NotBlank(message = "Time cannot be blank") Timestamp time) {
        this.time = time;
    }

    public SensorData() {
    }
}
