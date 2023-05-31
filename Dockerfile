FROM adoptopenjdk/openjdk13-openj9:latest
MAINTAINER ece.upatras.gr
COPY deploy/rest.example-0.0.1-SNAPSHOT-exec.jar /opt/rest.example/
WORKDIR /opt/rest.example/
CMD ["java", "-jar", "/opt/rest.example/rest.example-0.0.1-SNAPSHOT-exec.jar"]
EXPOSE 8880