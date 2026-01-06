# Spring Framework Applications – Task 1 & Task 2

## Author

Student: *Mykyta Shepelenko, 73200*

---

## Repository Overview

This repository contains **two Spring Boot applications** created as part of the Spring Framework course:

* **Task 1** – Introductory Spring Boot MVC application
* **Task 2** – REST API application with CRUD operations, Swagger, exception handling and database integration

Both projects were implemented according to the requirements provided in the course presentation and are fully testable using a browser, Postman, and Swagger UI.

---

## Task 1 – Spring Boot MVC Application

### Description

Task 1 is an introductory Spring Boot application created from scratch using **Spring Initializr**. The main goal of this task is to understand the basics of Spring Boot, controllers, request handling, and the MVC design pattern.

### Technologies

* Java
* Spring Boot
* Spring Web
* Thymeleaf
* Lombok
* Maven

### Functionalities

* Application startup using Spring Boot
* First Spring Controller
* Handling HTTP GET requests
* Returning plain text using `@ResponseBody`
* Returning an HTML view using MVC pattern

### How it works

1. The application is started from the main Spring Boot class.
2. A controller handles HTTP GET requests sent to `localhost:8080`.
3. One endpoint returns a simple text response.
4. Another endpoint returns an HTML view (`greeting.html`) rendered by Thymeleaf.
5. Static resources (e.g. image/logo) are displayed on the page.

---

## Task 2 – REST API Application

### Description

Task 2 is a fully backend **REST API application**. The project demonstrates layered architecture, REST principles, exception handling, Swagger documentation, and database integration.

### Technologies

* Java
* Spring Boot
* Spring Web
* Spring Data JPA
* H2 Database
* Swagger / OpenAPI
* Maven

### Project Structure

```
product
 ├── api
 │   ├── ProductController
 │   ├── request
 │   └── response
 ├── domain
 │   └── Product
 ├── repository
 │   └── ProductRepository
 ├── service
 │   └── ProductService
 └── support
     ├── ProductMapper
     ├── exception
     └── exception handler
```

### Implemented Endpoints

| HTTP Method | Endpoint              | Description        |
| ----------- | --------------------- | ------------------ |
| POST        | /api/v1/products      | Create new product |
| GET         | /api/v1/products/{id} | Get product by ID  |
| GET         | /api/v1/products      | Get all products   |
| PUT         | /api/v1/products/{id} | Update product     |
| DELETE      | /api/v1/products/{id} | Delete product     |

### Request / Response Flow

1. Client sends HTTP request (Postman / Swagger)
2. `ProductController` receives the request
3. Request body is mapped to `ProductRequest` or `UpdateProductRequest`
4. Business logic is executed in `ProductService`
5. Data is mapped using `ProductMapper`
6. Repository saves or retrieves data
7. Response is returned as `ProductResponse` wrapped in `ResponseEntity`

### Exception Handling

* Custom exception: `ProductNotFoundException`
* Global exception handling using `@ControllerAdvice`
* Proper HTTP status codes returned (e.g. 404 instead of 500)

### Swagger UI

Swagger is used for API documentation and testing.

Access Swagger UI:

```
http://localhost:8080/swagger-ui/index.html
```

API documentation (JSON):

```
http://localhost:8080/v3/api-docs
```

### Database

* H2 in-memory database
* Spring Data JPA + Hibernate
* Automatic table generation

H2 Console:

```
http://localhost:8080/console
```

JDBC URL:

```
jdbc:h2:mem:testdb
```
---

## Final Notes

* Both applications are fully functional
* All endpoints were tested using Postman and Swagger
* Project structure follows Spring best practices
* Code is ready for presentation and evaluation
