**Sales webpage server with Springboot**

- Maven build

`cd demo`

`mvn clean install`

`mvn spring-boot:run`

- Docker

`docker build -t pbenito-app .`

`docker run -p 8080:8080 -e SECRET_TOKEN_PBENITO=TOKEN pbenito-app`

`docker login`

`docker tag pbenito-app pbenito/pbenito-app:latest`

`docker push pbenito/pbenito-app:latest`

- API
  - `api/test/`

`curl -H "Authorization: TOKEN" https://pbenito.onrender.com/api/test`
