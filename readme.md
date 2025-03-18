# Backend Template for a REST API in Spring Boot

## 📌 Overview
This is a **backend template** for building a **REST API** using **Spring Boot**, following the **Hexagonal Architecture** and **Domain-Driven Design (DDD)** principles. It is designed for scalability, maintainability, and ease of testing.

## 🚀 Tech Stack
- **Java 17+**
- **Spring Boot 3.4.3**
- **Spring Data MongoDB**
- **Hexagonal Architecture**
- **Domain-Driven Design (DDD)**
- **Lombok**
- **Docker**

## 📂 Project Structure
```
backend-template/
│── src/main/java/com/otherside/backend_template/
│   ├── app/                     # Application Layer (Controllers, DTOs)
│   ├── context/users/
│   │   ├── domain/              # Domain Layer (Entities, Use Cases, Services)
│   │   ├── infrastructure/      # Infrastructure Layer (Persistence, Adapters)
│   │   ├── application/         # Application Services
│   ├── BackendTemplateApplication.java  # Main Spring Boot Entry Point
│── pom.xml                      # Project Dependencies
│── README.md                    # Project Documentation
```

## 🔧 Setup and Installation
### 1️⃣ Prerequisites
- **Java 17+**
- **Maven**
- **Docker** (for MongoDB)

### 2️⃣ Clone the Repository
```sh
git clone git@github.com:otherside9710/java-backend-template.git
cd backend-template
```

### 3️⃣ Run MongoDB with Docker
```sh
docker run -d --name mongodb -p 27017:27017 \
    -e MONGO_INITDB_ROOT_USERNAME=admin \
    -e MONGO_INITDB_ROOT_PASSWORD=pass \
    mongo
```

### 4️⃣ Configure `application.properties`
```properties
spring.application.name=backend-template
spring.data.mongodb.database=example
spring.data.mongodb.host=localhost
spring.data.mongodb.port=27017
spring.data.mongodb.username=admin
spring.data.mongodb.password=pass
spring.data.mongodb.authentication-database=admin
server.port=9000
```

### 5️⃣ Build and Run the Application
```sh
mvn clean install
mvn spring-boot:run
```

## 📌 API Endpoints
### Create a User
**Endpoint:** `POST /users`
```json
{
  "name": "John",
  "lastName": "Doe",
  "email": "john.doe@example.com",
  "phone": "123456789"
}
```
_Response (201 Created)_
```json
{
  "id": "generated-uuid",
  "name": "John",
  "lastName": "Doe",
  "email": "john.doe@example.com",
  "phone": "123456789"
}
```

## 🔥 Features
✅ **Hexagonal Architecture** - Clean separation of concerns.
✅ **Domain-Driven Design (DDD)** - Well-structured domain layer.
✅ **MongoDB Integration** - NoSQL persistence layer.
✅ **Spring Boot Best Practices** - Lightweight and scalable.

## 📜 License
This project is open-source and available under the [MIT License](LICENSE).

---
_Developed with ❤️ by Otherside_

