#
# Build stage
#
FROM maven:3.6.3-jdk-8-slim AS build
COPY . /home/app/src
WORKDIR /home/app/src
RUN mvn clean install -DskipTests=true

#
# Package stage
#
FROM openjdk:8-jre-slim
COPY --from=build /home/app/src/target/dove-0.0.1-SNAPSHOT.jar /usr/local/lib/dove.jar
EXPOSE 8080:8080
ENTRYPOINT ["java","-jar","/usr/local/lib/dove.jar"]