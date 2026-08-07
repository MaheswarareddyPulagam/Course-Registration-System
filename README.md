# 🎓 Course Registration System

A backend **Course Registration System** built using **Java, Spring Boot, Spring Data JPA, and MySQL**. The project provides RESTful APIs for managing students and courses with CRUD operations and input validation.

## 🚀 Features

* Student management
* Course management
* Create, read, update, and delete operations
* RESTful APIs
* Input validation
* MySQL database integration
* Spring Data JPA for database operations
* Layered architecture
* API testing using Postman

## 🛠️ Tech Stack

* **Java 21**
* **Spring Boot**
* **Spring Web**
* **Spring Data JPA**
* **Hibernate**
* **MySQL**
* **Maven**
* **Postman**

## 🏗️ Architecture

```text
Client / Postman
       ↓
  Controller
       ↓
    Service
       ↓
   Repository
       ↓
     MySQL
```

The application follows a **Controller → Service → Repository** layered architecture to separate API handling, business logic, and database operations.

## 📂 Project Structure

```text
src/main/java/com/example/courseregistration/
│
├── controller/
│   ├── StudentController.java
│   └── CourseController.java
│
├── service/
│   ├── StudentService.java
│   ├── StudentServiceImpl.java
│   ├── CourseService.java
│   └── CourseServiceImpl.java
│
├── repository/
│   ├── StudentRepository.java
│   └── CourseRepository.java
│
├── entity/
│   ├── Student.java
│   └── Course.java
│
└── CourseRegistrationApplication.java
```

## ⚙️ Setup

### 1. Clone the repository

```bash
git clone https://github.com/MaheswarareddyPulagam/<repository-name>.git
cd course-registration
```

### 2. Create the MySQL database

```sql
CREATE DATABASE course_registration;
```

### 3. Configure database credentials

Open:

```text
src/main/resources/application.properties
```

Update your MySQL credentials:

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/course_registration
spring.datasource.username=root
spring.datasource.password=YOUR_PASSWORD
```

> ⚠️ Do not commit your actual database password to GitHub.

### 4. Run the application

```bash
mvn spring-boot:run
```

The application will start at:

```text
http://localhost:8080
```

## 📡 API Endpoints

### 👨‍🎓 Student APIs

| Method | Endpoint         | Description       |
| ------ | ---------------- | ----------------- |
| POST   | `/students`      | Create a student  |
| GET    | `/students`      | Get all students  |
| GET    | `/students/{id}` | Get student by ID |
| PUT    | `/students/{id}` | Update student    |
| DELETE | `/students/{id}` | Delete student    |

### 📚 Course APIs

| Method | Endpoint        | Description      |
| ------ | --------------- | ---------------- |
| POST   | `/courses`      | Create a course  |
| GET    | `/courses`      | Get all courses  |
| GET    | `/courses/{id}` | Get course by ID |
| PUT    | `/courses/{id}` | Update course    |
| DELETE | `/courses/{id}` | Delete course    |

## 🧪 API Testing

The REST APIs were tested using **Postman**.

Example student request:

```http
POST http://localhost:8080/students
```

```json
{
  "name": "John Doe",
  "email": "john@example.com"
}
```

Example course request:

```http
POST http://localhost:8080/courses
```

```json
{
  "name": "Data Structures",
  "code": "CSE201"
}
```

## 📚 Key Learning

This project helped me gain practical experience in:

* Developing REST APIs with Spring Boot
* Implementing CRUD operations
* Using Spring Data JPA and Hibernate
* Integrating MySQL with a Spring Boot application
* Designing a layered backend architecture
* Implementing request validation
* Testing APIs with Postman

## 🔮 Future Improvements

* Student-course enrollment relationships
* DTO-based request/response handling
* Global exception handling
* Pagination and sorting
* Swagger/OpenAPI documentation
* Authentication and authorization
* Unit and integration testing

