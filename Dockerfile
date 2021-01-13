FROM openjdk:8
ADD target/location-user.jar location-user.jar
EXPOSE 8087
ENTRYPOINT ["java", "-jar", "location-user.jar"]