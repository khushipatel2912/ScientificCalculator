FROM ubuntu:latest

# Set working directory
WORKDIR /app

# Use a minimal JRE image for runtime
FROM openjdk:17-jre-slim

# Set working directory
WORKDIR /app

# Copy the built jar file from the previous stage
COPY target/Calculator-1.0-SNAPSHOT.jar calculator.jar

# Set execution command
CMD ["java", "-jar", "calculator.jar"]
