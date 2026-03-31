FROM eclipse-temurin:11-jre

WORKDIR /app

COPY target/java-cicd-demo-1.0.1.jar app.jar

EXPOSE 3000

CMD ["java", "-jar", "app.jar"]
