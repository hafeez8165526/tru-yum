FROM openjdk:11
WORKDIR usr/src
COPY target/emp-client-1.0.jar ./
ENTRYPOINT ["java","-jar","emp-client-1.0.jar"]

