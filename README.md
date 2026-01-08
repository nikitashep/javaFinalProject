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
<img width="1470" height="956" alt="Screenshot 2026-01-08 at 01 29 05" src="https://github.com/user-attachments/assets/eee7a894-5db2-4a7e-bb2a-5280319c5e78" />
4. Another endpoint returns an HTML view (`greeting.html`) rendered by Thymeleaf.
5. Static resources (e.g. image/logo) are displayed on the page.
<img width="1470" height="956" alt="Screenshot 2026-01-08 at 01 29 30" src="https://github.com/user-attachments/assets/2cf23dab-90d4-4ce2-8c96-8f4e67bfea6c" />

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

### Testing every HTTP Method used in application

1. POST (Creating 3 products):

<img width="1470" height="956" alt="Screenshot 2026-01-08 at 01 34 31" src="https://github.com/user-attachments/assets/3b5692d5-b0f2-49f9-a036-654ba90085fc" />

<img width="1470" height="956" alt="Screenshot 2026-01-08 at 01 34 41" src="https://github.com/user-attachments/assets/fb14d1e9-60aa-49ae-ae47-4d0673fc1e75" />

<img width="1470" height="956" alt="Screenshot 2026-01-08 at 01 34 49" src="https://github.com/user-attachments/assets/64267233-2be1-412f-9646-d029853e6eab" />

3. GET (Trying to get product product which was created)

<img width="1470" height="956" alt="Screenshot 2026-01-08 at 01 35 20" src="https://github.com/user-attachments/assets/e23c706c-e05a-4ff7-ab4b-d359188bb3b8" />

4. GET (Trying to get product which does not exist)

<img width="1470" height="956" alt="Screenshot 2026-01-08 at 19 47 47" src="https://github.com/user-attachments/assets/58f4bd32-fff7-4e5d-9602-0051a1ca21cd" />

5. PUT (Changing value in one of the products)

<img width="1470" height="956" alt="Screenshot 2026-01-08 at 01 36 56" src="https://github.com/user-attachments/assets/e5447804-7dd0-4ce1-b705-e14b3e214edb" />

6. GET ALL (Trying to get all products)

<img width="1470" height="956" alt="Screenshot 2026-01-08 at 01 37 25" src="https://github.com/user-attachments/assets/722d4946-155d-4577-bb34-bde1eb542215" />

7. DELETE (Deleting one of the products)

<img width="1470" height="956" alt="Screenshot 2026-01-08 at 01 37 57" src="https://github.com/user-attachments/assets/407c2038-e9da-4796-a898-09f975735772" />

Result:

<img width="1470" height="956" alt="Screenshot 2026-01-08 at 01 38 09" src="https://github.com/user-attachments/assets/96d98838-19ca-4ca8-81ba-328c092fc5f8" />

Result in Database:

<img width="1470" height="956" alt="Screenshot 2026-01-08 at 01 39 50" src="https://github.com/user-attachments/assets/b75c5ce3-51c7-4db0-9241-a41159c9b24e" />

---

## Final Notes

* Both applications are fully functional
* All endpoints were tested using Postman and Swagger
* Project structure follows Spring best practices
* Code is ready for presentation and evaluation
