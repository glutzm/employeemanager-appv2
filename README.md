# Employee Manager App

Repositório de uma simples aplicação integrando Angular com Spring Boot
baseada nas aulas do curso 
[Spring Boot Full Stack with Angular | Full Course [2021] [NEW]](https://www.youtube.com/watch?v=Gx4iBLKLVHk)
do canal [Amigoscode](https://www.youtube.com/@amigoscode).

Este projeto é um teste embutindo a aplicação front-end dentro do JAR da aplicação Spring Boot.

## Pré-requisitos
1. Docker 20.10.21
2. Docker Compose 2.14.1
3. Java JDK 17.0.5

## Instruções
1. Suba a aplicação de Banco de Dados com:
    ```bash
    docker-compose -f ./employeemanager/docker-compose.yml up -d
    ```

2. Acesse o diretório *employeemanager* e inicie a aplicação em Spring Boot com:
    ```bash
    mvn spring-boot:run
    ```
