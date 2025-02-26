FROM maven:3.8.5-openjdk-17 AS build

# Set working directory
WORKDIR /app

# Copy Maven project files
COPY pom.xml .
COPY src ./src

# Build the project
RUN mvn clean package

# Use a minimal JRE image for runtime
FROM openjdk:17-jre-slim

# Set working directory
WORKDIR /app

# Copy the built jar file from the previous stage
COPY --from=build /app/target/calculator-1.0-SNAPSHOT.jar calculator.jar

# Set execution command
CMD ["java", "-jar", "calculator.jar"]
