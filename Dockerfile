FROM openjdk:8-jdk-alpine
COPY target/awsSession.jar awsSession.jar
ENTRYPOINT ["java","-jar","/awsSession.jar"]