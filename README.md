# BuyOgo_Backend_Assignment

This repository contains the backend implementation for the BuyOgo application as part of the backend assignment.

## Description

BuyOgo is an e-commerce platform designed to provide users with a seamless shopping experience. This backend component handles various functionalities such as managing training centers, user authentication, and providing APIs for the frontend to interact with.

## Dependencies

- Java 21
- Spring Boot 2.5.4
- Spring Data JPA
- Hibernate
- Postgres Database (for local development)
- Swagger (for API documentation)

## APIs

### Training Centers

- **GET /api/training-centers**: Retrieve all training centers.
- **POST /api/training-centers**: Create a new training center.
- **GET /api/training-centers/{centerCode}**: Retrieve details of a training center by its center code.

## Getting Started

To run the application locally, follow these steps:

1. Clone this repository to your local machine.
2. Ensure that Java 21 is installed.
3. Build the project using Maven: `mvn clean install`.
4. Run the application: `java -jar target/BuyOgo_Backend_Assignment.jar`.
5. Access the application at `http://localhost:8080`.
