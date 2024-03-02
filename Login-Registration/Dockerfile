# Stage 1: Build stage
FROM maven:3.8.5-openjdk-17 AS build
WORKDIR /app
COPY .. .
RUN mvn clean package -DskipTests

# Stage 2: Production stage
FROM openjdk:17.0.1-jdk-slim
WORKDIR /app
COPY --from=build /app/target/demo-0.0.1-SNAPSHOT.jar Login-Registration_backend.jar
EXPOSE 9092
ENTRYPOINT ["java","-jar","Login-Registration_backend.jar"]
