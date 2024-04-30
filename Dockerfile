FROM openjdk:17
EXPOSE 9090
ADD target/user-details-docker.jar user-details-docker.jar
ENTRYPOINT ["java","-jar","/user-details-docker.jar"]