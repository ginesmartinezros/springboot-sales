@echo off

:: Cambiar al directorio 'demo'
cd demo

:: Ejecutar mvn clean install
mvn clean install && docker build -t pbenito-app . && docker login && docker tag pbenito-app pbenito/pbenito-app:latest && docker push ginesbarqueros/pbenito-app:latest