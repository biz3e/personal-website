# Build stage
FROM maven:3.8.5-openjdk-17 as builder
WORKDIR /app
COPY pom.xml .
COPY src /app/src
RUN mvn -f /app/pom.xml clean package

# Run stage
FROM openjdk:17-jdk-alpine
COPY --from=builder /app/target/*.jar /app.jar

# Run the web service on container startup.
CMD ["java", "-jar", "/app.jar"]