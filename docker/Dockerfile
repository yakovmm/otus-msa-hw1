FROM ormos/alpine-java-11
WORKDIR /app
COPY ./target/hw1.jar .
CMD ["java", "-jar", "/app/hw1.jar"]

#FROM alpine:3.16
#WORKDIR /app
#COPY --from=java /app .
#ENTRYPOINT ["java", "-jar", "/app/hw1.jar"]
#ormos/alpine-java-11