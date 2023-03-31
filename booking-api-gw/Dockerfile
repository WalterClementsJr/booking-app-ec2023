FROM amazoncorretto:11-alpine3.17-jdk
EXPOSE 9090
ENV jarname=booking-api-gw-latest.jar
COPY ./target/${jarname} ${jarname}
ENTRYPOINT java -jar /${jarname} & 
