# Stage 1: Build stage
FROM maven:3.8.5-openjdk-17 AS build

COPY . .
RUN mvn clean package -DskipTests

# Stage 2: Production stage
FROM openjdk:17.0.1-jdk-slim

COPY --from=build /target/Login-Registration-0.0.1-SNAPSHOT.jar Login-Registration.jar

EXPOSE 9092
ENTRYPOINT ["java","-jar","Login-Registration.jar"]
