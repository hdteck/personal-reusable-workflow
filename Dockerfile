FROM eclipse-temurin:17-jdk-alpine as prod

# Refer to Maven build -> finalName
ARG JAR_FILE=target/springboot-backend-0.1-SNAPSHOT.jar

# cd /opt/app
WORKDIR /opt/app

# cp target/spring-boot-web.jar /opt/app/app.jar
COPY ${JAR_FILE} app.jar

# java -jar /opt/app/app.jar
ENTRYPOINT ["java","-jar","app.jar"]