FROM openjdk:8u282-jdk

RUN apt-get update && apt-get install -y telnet

RUN wget -qO - https://www-us.apache.org/dist/maven/maven-3/3.6.3/binaries/apache-maven-3.6.3-bin.tar.gz \
    | tar xfz - -C /opt \
    && ln -s /opt/apache-maven-3.6.3 /opt/maven

ENV M2_HOME /opt/maven
ENV MAVEN_HOME ${M2_HOME}
ENV PATH ${M2_HOME}/bin:${PATH}

#Any following command will be executed relative to this path in the container.
WORKDIR /usr/my-rest-api

COPY ./pom.xml ./
RUN mvn dependency:go-offline

COPY ./ ./
RUN mvn clean install

WORKDIR target

#set the default command; does not create a new filesystem layer.
#if a default command is not specified; docker will use the one from the base image.
CMD ["java", "-jar", "my-rest-api-0.0.1.jar"]

