# Use the official OpenJDK 17 image
FROM openjdk:17
COPY target/serviceB-0.0.1-SNAPSHOT.jar serviceb.jar
ENTRYPOINT ["java","-jar","/serviceb.jar"]
