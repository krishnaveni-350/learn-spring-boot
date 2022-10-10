# Base image containing Java runtime
FROM openjdk:8-jdk-alpine

# Add the application's jar to the container
ADD target/*.jar springboot-openshift.jar

# Make port 8080 available
EXPOSE 8080

# Run the jar file
ENTRYPOINT ["java","-jar","/springboot-openshift.jar"]