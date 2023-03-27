FROM 11-alpine3.17-jdk
EXPOSE 8880
ENV jarname=booking-api-gw-latest.jar
COPY ./target/${jarname} ${jarname}
ENTRYPOINT java -jar /${jarname}