FROM amazoncorretto:17
MAINTAINER rodrigo
COPY target/porfolio-BackEnd-0.0.1-SNAPSHOT.jar porfolio-BackEnd-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","/porfolio-BackEnd-0.0.1-SNAPSHOT.jar"]
