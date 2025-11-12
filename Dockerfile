FROM openjdk:17-ea-10-jdk
EXPOSE 8080
ADD target/docker-jenkins2.jar docker-jenkins2.jar
ENTRYPOINT [ "java", "-jar", "/docker-jenkins2.jar" ]