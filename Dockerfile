FROM maven:3.8.5-openjdk-17 AS build-env

# Set the working directory to /app
WORKDIR /app
# Copy the pom.xml file to download dependencies
COPY pom.xml ./
# Copy local code to the container image.
COPY src ./src

# Download dependencies and build a release artifact.
RUN mvn package -DskipTests

# Use OpenJDK for base image.
# https://hub.docker.com/_/openjdk
# https://docs.docker.com/develop/develop-images/multistage-build/#use-multi-stage-builds
FROM openjdk:17-jdk-alpine

# Copy the jar to the production image from the builder stage.
COPY --from=build-env /app/target/personalPortfolio-*.jar /personalPortfolio.jar

# Run the web service on container startup.
CMD ["java", "-jar", "/personalPortfolio.jar"]