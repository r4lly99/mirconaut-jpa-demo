FROM openjdk:14-alpine
COPY build/libs/mirconaut-jpa-demo-*-all.jar mirconaut-jpa-demo.jar
EXPOSE 8080
CMD ["java", "-Dcom.sun.management.jmxremote", "-Xmx128m", "-jar", "mirconaut-jpa-demo.jar"]