FROM openjdk:8-jdk-alpine
VOLUME /tmp
ARG JAR_FILE
COPY /target/eurekaserver-viceman-0.0.1-SNAPSHOT.jar eurekaserver-viceman.jar
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/eurekaserver-viceman.jar"]