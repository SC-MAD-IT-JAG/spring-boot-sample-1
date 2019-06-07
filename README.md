# Spring Boot 2 Sample 1

Sample Spring Boot Application (version 2.1.4.RELEASE) 
Have 2 Endpoint Rest returning the same results but with two different implementations
Good Start

# Run

To build and run:

    mvn spring-boot:run

or create the jar

    mvn clean package
    java -jar target\spring-boot-sample-1-1.0.0-SNAPSHOT.jar

# Docker

To build the docker image

    docker build -t spring-boot-sample-1 .
    
## Run

    docker run --name spring-boot-sample-1 -p 8080:8080 -d spring-boot-sample-1
    
# Testing Endpoints

    curl http://localhost:8080
    curl http://localhost:8080/rest1
