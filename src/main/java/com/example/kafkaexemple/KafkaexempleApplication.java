package com.example.kafkaexemple;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class KafkaexempleApplication {

	public static void main(String[] args) {

		System.out.println("*****Application is started ****");
		SpringApplication.run(KafkaexempleApplication.class, args);
	}

}
