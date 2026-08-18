FROM openjdk:22-jdk
ADD target/docker-app.jar docker-app.jar
ENTRYPOINT ["java", "-jar", "/docker-app.jar"]