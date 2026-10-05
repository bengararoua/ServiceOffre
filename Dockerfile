# Stage 1: Build the application using Java 17
FROM eclipse-temurin:17-jdk AS build
WORKDIR /app

# Copy maven wrapper and pom.xml to cache dependencies
COPY .mvn/ .mvn
COPY mvnw pom.xml ./

# Download dependencies
RUN ./mvnw dependency:go-offline

# Copy source code and build the JAR
COPY src ./src
RUN ./mvnw clean package -DskipTests

# Stage 2: Run the application using a lightweight Java 17 JRE
FROM eclipse-temurin:17-jre
WORKDIR /app

# Copy the built jar from the build stage
COPY --from=build /app/target/*.jar app.jar

# Expose port (Render sets the PORT env variable)
EXPOSE 8080

# Run the application
ENTRYPOINT ["java", "-jar", "app.jar"]