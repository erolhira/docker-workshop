FROM openjdk:8u282-jdk

RUN apt-get update && apt-get install telnet

COPY target/my-rest-api-0.0.1.jar /usr/my-rest-api/

WORKDIR /usr/my-rest-api

CMD ["java", "-jar", "my-rest-api-0.0.1.jar"]
