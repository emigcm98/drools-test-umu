FROM gradle:7.5-jdk11-alpine

WORKDIR /app
COPY . .
EXPOSE 8080
USER root
RUN chown -R gradle /app
USER gradle

#RUN ./gradlew build --stacktrace

#CMD ["./gradlew bootRun --info"]
CMD ["./gradlew", "bootRun", "--info"]

