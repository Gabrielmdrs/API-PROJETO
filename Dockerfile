FROM eclipse-temurin:17-jdk

# Definir diretório de trabalho dentro do contêiner
WORKDIR /app

# Copiar o JAR para dentro do contêiner
COPY target/api-projeto.jar app.jar

EXPOSE 8080

# Comando para executar a aplicação
ENTRYPOINT ["java", "-jar", "app.jar"]