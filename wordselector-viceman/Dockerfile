FROM openjdk:8-jdk-alpine
VOLUME /tmp
ARG JAR_FILE
COPY /target/wordselector-viceman-0.0.1-SNAPSHOT.jar wordselector-viceman.jar
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/wordselector-viceman.jar"]