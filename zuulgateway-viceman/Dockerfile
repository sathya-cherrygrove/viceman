FROM openjdk:8-jdk-alpine
VOLUME /tmp
ARG JAR_FILE
COPY /target/zuulgateway-viceman-0.0.1-SNAPSHOT.jar zuulgateway-viceman.jar
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/zuulgateway-viceman.jar"]