# Use the official OpenJDK 17 image
FROM openjdk:17
COPY target/serviceC-0.0.1-SNAPSHOT.jar servicec.jar
ENTRYPOINT ["java","-jar","/servicec.jar"]
