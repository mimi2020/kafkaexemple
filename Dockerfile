#FROM openjdk:17-jdk-slim
#WORKDIR /app
#ARG JAR_FILE=target/kafkaexemple-0.0.1-SNAPSHOT.jar
#COPY ${JAR_FILE} app.jar
#ENTRYPOINT ["java", "-jar", "/app.jar"]
FROM eclipse-temurin:17-jdk-alpine
RUN mkdir app
COPY target/kafkaexemple-0.0.1-SNAPSHOT.jar /app
WORKDIR /app
ENTRYPOINT ["java", "-jar", "kafkaexemple-0.0.1-SNAPSHOT.jar"]
#ENTRYPOINT ["sleep", "1000"]
