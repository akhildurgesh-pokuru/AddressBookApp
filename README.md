# AddressBookApp

# Spring Address Book Application

## Project Description

The **Spring Address Book Application** is a RESTful web application developed using Java and Spring Boot. It is designed to manage Address Book data through REST APIs. The project replaces the JSON Server used in the existing Address Book Frontend UI with a Spring Boot backend.

The application demonstrates the development of a layered Spring Boot application, including REST Controllers, DTOs, Models, and Service layers. It also establishes connectivity with a MySQL database and supports CRUD (Create, Read, Update, Delete) operations.

## Technologies Used

- **Java** – Backend programming
- **Spring Boot** – Application development
- **Spring Web** – REST API development
- **Spring Data JPA** – Database interaction
- **MySQL** – Database management
- **Maven** – Project and dependency management
- **Postman / cURL** – REST API testing
- **Git & GitHub** – Version control

## Use Cases Implemented

### Section 1: Address Book App Setup

**UC 1 – Spring Project Setup**
- Created a Spring Boot project to handle REST requests from the Address Book Frontend UI.
- Replaced JSON Server API calls with Spring Boot backend calls.
- Organized each use case in a separate Git branch and merged completed work into the main branch.

**UC 2 – REST Controller and HTTP Methods**
- Created REST Controller endpoints to demonstrate HTTP methods.
- Configured MySQL database properties.
- Used `ResponseEntity` to return JSON responses.
- Tested GET, GET by ID, POST, PUT by ID, and DELETE operations using cURL commands.

### Section 2: DTO, Model and Service Layer

**UC 1 – Introducing DTO and Model**
- Introduced DTO and Model classes to structure Address Book data.
- Used `ResponseEntity` to handle REST API responses.
- Tested API operations using cURL.

**UC 2 – Introducing Service Layer**
- Created a Service layer to manage Address Book operations.
- Separated business logic from the Controller layer.
- Used dependency injection with the `@Autowired` annotation.

**UC 3 – Storing Address Book Data in Memory**
- Implemented in-memory data storage using a Java List.
- Added functionality to store, retrieve, update, and delete Address Book records.
- Tested all CRUD operations using cURL commands.

## REST API Operations

| HTTP Method | Operation | Description |
|---|---|---|
| GET | Get All Records | Retrieve all Address Book records |
| GET | Get by ID | Retrieve a specific record |
| POST | Add Record | Create a new Address Book record |
| PUT | Update by ID | Update an existing record |
| DELETE | Delete by ID | Remove a record |

## Project Objective

The main objective of this project is to understand and implement RESTful web services using Spring Boot, establish communication between frontend and backend applications, organize code using layered architecture, and perform CRUD operations through REST APIs.

## Learning Outcomes

- Understanding Spring Boot project structure.
- Developing REST APIs using HTTP methods.
- Working with DTOs and Model classes.
- Implementing Controller and Service layers.
- Understanding dependency injection.
- Connecting Spring Boot with MySQL.
- Performing CRUD operations.
- Testing REST APIs using cURL.
- Managing project development using Git branches and GitHub.
