# Employee Manager App

Repositório de uma simples aplicação integrando Angular com Spring Boot
baseada nas aulas do curso 
[Spring Boot Full Stack with Angular | Full Course [2021] [NEW]](https://www.youtube.com/watch?v=Gx4iBLKLVHk)
do canal [Amigoscode](https://www.youtube.com/@amigoscode).

## Pré-requisitos
1. Docker 20.10.21
2. Docker Compose 2.14.1
3. Java JDK 17.0.5
4. Node v16.18.0
5. NPM 8.19.2
6. Angular CLI 15.0.4

## Instruções
1. Suba a aplicação de Banco de Dados com:
    ```bash
    docker-compose -f ./backend/docker-compose.yml up -d
    ```

2. Acesse o diretório *backend* e inicie a aplicação em Spring Boot com:
    ```bash
    mvn spring-boot:run
    ```

3. Acesse o diretório *frontend* e inicie a aplicação em Angular com:
    ```bash
   ng serve
    ```