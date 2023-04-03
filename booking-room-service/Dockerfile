FROM amazoncorretto:11-alpine3.17-jdk
EXPOSE 9093
COPY ./target/booking-financial-service-latest.jar booking-financial-service.jar
ENTRYPOINT ["java","-jar","/booking-financial-service.jar"]
