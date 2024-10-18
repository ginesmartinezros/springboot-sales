# Usa la imagen base de OpenJDK
FROM openjdk:17-oracle

# Establece el directorio de trabajo
WORKDIR /app

# Copia el archivo JAR de tu aplicación al contenedor
COPY target/demo-0.0.1-SNAPSHOT.jar app.jar

# Expone el puerto en el que tu aplicación escucha
EXPOSE 8080

# Comando para ejecutar tu aplicación
CMD ["java", "-jar", "app.jar"]
