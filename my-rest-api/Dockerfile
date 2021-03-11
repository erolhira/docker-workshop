FROM openjdk:8u282-jdk

RUN apt-get update && apt-get install telnet

#Any following command will be executed relative to this path in the container.
WORKDIR /usr/my-rest-api

COPY target/my-rest-api-0.0.1.jar ./

#set the default command; does not create a new filesystem layer.
#if a default command is not specified; docker will use the one from the base image.
CMD ["java", "-jar", "my-rest-api-0.0.1.jar"]
