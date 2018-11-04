FROM openjdk:8-jdk-alpine
VOLUME /tmp
ARG JAR_FILE
COPY /target/datamuse-viceman-0.0.1-SNAPSHOT.jar datamuse-viceman.jar
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/datamuse-viceman.jar"]