# Hiberus-billing

Hiberus-billing is the microservice to billing the order incomming of checkout mircroservice.
The microservice returns a object BillDto and is registered in the eureka server of microservers

## Installation

Use the package manager gradle to install dependecies of the build gradle.

```bash
gradle clean build
```

Note: needs a gradle version 6.0 or higher

## Dependecies

spring-cloud-starter-netflix-eureka-client: eureka client to registered to a eureka server.
spring-boot-starter-web : create rest api services
springfox-swagger2: documentation librery of swagger
springfox-swagger-ui: swagger ui interface


## Usage

- Import project as gradle project.
- rigth click in HiberusBillingApplication and Run as a Java application
- ingress http://localhost:8761/, you find a dashboard with the microservice hiberus-billing active.
- to watch the swagger documentation of the api ingress to http://localhost:8089/swagger-ui.html#/

## What we expect from you

- I have no experience working witch docker containers so i just created the DockerFile, to create the image
a deployit in a docker container 