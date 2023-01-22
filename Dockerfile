FROM openjdk:17-alpine
MAINTAINER ammar
COPY target/hr-project-0.0.1-SNAPSHOT.war hr-project-0.0.1-SNAPSHOT.war
ENTRYPOINT ["java","-war","/hr-project-0.0.1-SNAPSHOT.war"]