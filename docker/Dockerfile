FROM kubespheredev/java-11-runtime
WORKDIR /app
COPY ./target/hw1.jar .
ENTRYPOINT ["java", "-jar", "/app/hw1.jar"]
ENV HTTP_PORT=8000 APP_LOG_LEVEL=ERROR