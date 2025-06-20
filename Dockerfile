FROM openjdk:17
LABEL authors="VKV"
COPY target/ServiceDiscoveryJan31Capstone-0.0.1-SNAPSHOT.jar servicDiscovery.jar
ENTRYPOINT ["java", "-jar","servicDiscovery.jar"]