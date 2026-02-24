# Stage 1: Build with Gradle 9.2.1 and JDK 25
FROM gradle:9.2.1-jdk25 AS build
COPY --chown=Gradle:gradle . /app
WORKDIR /app
RUN gradle bootJar --no-daemon

# Stage 2: Runtime with JDK 25
FROM eclipse-temurin:25-jdk
WORKDIR /app
COPY --from=build /app/build/libs/*.jar play-push.jar