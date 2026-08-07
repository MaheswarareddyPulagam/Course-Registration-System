# Course Registration System

Spring Boot backend project using Spring Data JPA and MySQL.

## Technologies
- Java 21
- Spring Boot
- Spring Web
- Spring Data JPA
- MySQL
- Maven
- Postman

## Architecture

Controller -> Service -> Repository -> MySQL

## Setup

1. Create a MySQL database:
   CREATE DATABASE course_registration;

2. Open `src/main/resources/application.properties`.

3. Replace `YOUR_PASSWORD` with your MySQL password.

4. Run:
   mvn spring-boot:run

## Main endpoints

### Students
POST   /students
GET    /students
GET    /students/{id}
PUT    /students/{id}
DELETE /students/{id}

### Courses
POST   /courses
GET    /courses
GET    /courses/{id}
PUT    /courses/{id}
DELETE /courses/{id}

Use Postman to test the REST APIs.
