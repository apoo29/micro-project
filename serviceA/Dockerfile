# Use the official OpenJDK 17 image
FROM openjdk:17
COPY target/serviceA-0.0.1-SNAPSHOT.jar servicea.jar
ENTRYPOINT ["java","-jar","/servicea.jar"]
