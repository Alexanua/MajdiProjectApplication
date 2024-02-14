# Basera vår bild på en officiell Java 17 image
FROM openjdk:17-jdk-slim

# Sätt en label för att identifiera skaparen av bilden
LABEL authors="macbook"

# Ange arbetsmappen i containern
WORKDIR /app

# Kopiera den byggda applikations-JAR-filen till arbetsmappen i containern
COPY target/contacts-app.jar /app/

# Exponera port 8081 (samma som i din application.properties)
EXPOSE 8081

# Kör applikationen när containern startas
CMD ["java", "-jar", "contacts-app.jar"]
