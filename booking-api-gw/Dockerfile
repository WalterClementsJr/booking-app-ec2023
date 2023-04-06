ARG JAVA_IMAGE
FROM ${JAVA_IMAGE}

ARG ARTIFACT
ARG TAG

RUN mkdir -p ~/booking/${ARTIFACT}
RUN chmod 755 ~/booking/${ARTIFACT}

#COPY ../booking-api-gw/target/${ARTIFACT}-${TAG}.jar /root/booking/${ARTIFACT}/${ARTIFACT}-${TAG}.jar
#COPY ../booking-api-gw/target/ /root/booking/${ARTIFACT}/
