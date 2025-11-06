#FROM openjdk:17-jdk-slim
#WORKDIR /app
#ARG JAR_FILE=target/kafkaexemple-0.0.1-SNAPSHOT.jar
#COPY ${JAR_FILE} app.jar
#ENTRYPOINT ["java", "-jar", "/app.jar"]
FROM openjdk:17-jdk-slim
RUN mkdir app
COPY target/kafkaexemple-0.0.1-SNAPSHOT.jar /app
WORKDIR /app
ENTRYPOINT ["java", "-jar", "kafkaexemple-0.0.1-SNAPSHOT.jar"]
#ENTRYPOINT ["sleep", "1000"]
