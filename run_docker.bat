@echo off

:: Cambiar al directorio 'demo'
cd demo

:: Ejecutar mvn clean install
mvn clean install && docker build -t pbenito-app . && docker run -p 8080:8080 -e SECRET_TOKEN_PBENITO=aFccgwB7fvO2SStV6J5aJgLlooHLAgAZUZO1BYrm8zvCuFuBWsChBqs5WjQxaC39 pbenito-app