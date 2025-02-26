FROM openjdk:17-jdk-slim
FROM ubuntu:latest

# Set working directory
WORKDIR /app

# Set working directory
WORKDIR /app

# Copy the built jar file from the previous stage
COPY target/Calculator-1.0-SNAPSHOT.jar calculator.jar

# Set execution command
CMD ["java", "-jar", "calculator.jar"]
