
FROM eclipse-temurin:21-jdk AS build-stage


WORKDIR /app

COPY . .

RUN ./mvnw clean package


FROM eclipse-temurin:21-jre-alpine

COPY target/springsecurity-0.0.1-SNAPSHOT.jar app.jar

EXPOSE 8083

ENTRYPOINT ["java", "-jar", "app.jar"]