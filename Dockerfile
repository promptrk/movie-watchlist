FROM amazoncorretto:21-alpine
COPY target/movie-watchlist-1.0.0.jar app.jar
ENTRYPOINT ["java", "-jar", "/app.jar"]
