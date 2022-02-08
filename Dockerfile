FROM openjdk:11
WORKDIR usr/src
COPY target/truyum-1.0.jar ./
ENTRYPOINT ["java","-jar","truyum-1.0.jar"]

