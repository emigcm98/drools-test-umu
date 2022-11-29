FROM gradle:7.5-jdk11-alpine

WORKDIR /app
COPY . .
EXPOSE 9898
USER root
RUN chown -R gradle /app
USER gradle

CMD ["./gradlew", "bootRun", "--info"]

