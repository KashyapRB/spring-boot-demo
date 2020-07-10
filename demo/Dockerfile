#pull base image
FROM adoptopenjdk:8-jre-hotspot

ADD target/spring-boot-demo3-1.0.jar spring-boot-demo3-1.0.jar

#Maintainer 
MAINTAINER kashyapRBharath

#Expose port 8085
EXPOSE 8085

#default command
ENTRYPOINT ["java","-jar","spring-boot-demo3-1.0.jar"]
