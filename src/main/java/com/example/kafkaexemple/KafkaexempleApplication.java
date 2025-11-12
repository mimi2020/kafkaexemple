package com.example.kafkaexemple;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import java.util.logging.Logger;
@SpringBootApplication
public class KafkaexempleApplication {

	public static void main(String[] args) {
		Logger logger = Logger.getLogger(KafkaexempleApplication.class.getName());
   logger.info("*****Application is started ****");


		SpringApplication.run(KafkaexempleApplication.class, args);
	}

}
