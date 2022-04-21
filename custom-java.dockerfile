# Build stage
FROM maven:3.6.0-jdk-11-slim AS build
COPY ./src /home/app/src
COPY ./pom.xml /home/app
RUN mvn -f /home/app/pom.xml clean install -U -DskipTests

# Package stage
FROM openjdk:8
COPY --from=build /home/app/target/employee.jar /usr/local/lib/employee.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","/usr/local/lib/employee.jar"]