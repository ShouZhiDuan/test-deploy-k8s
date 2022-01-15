FROM openjdk-11
MAINTAINER SHOUZHI
ADD target/app.jar /k8s-work/app.jar
ENTRYPOINT ["java","-jar","/k8s-work/app.jar"]