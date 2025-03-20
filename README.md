# User Management System with Spring Security

This project is a **User Management System** built using **Spring Boot** with **Spring Security 6** for authentication and authorization. It provides APIs for user registration, login, and basic CRUD operations.

## Features
- User registration with password encryption
- Secure login with authentication
- CRUD operations for user management
- Spring Security integration for secure endpoints

## Technologies Used
- **Spring Boot**
- **Spring Security 6**
- **JWT Authentication**
- **MySQL Database**
- **Lombok**

## API Endpoints

### Authentication Endpoints
| Method | Endpoint       | Description |
|--------|---------------|-------------|
| POST   | `/register`    | Registers a new user |
| POST   | `/login`       | Authenticates a user and returns a token |

### User Management Endpoints
| Method | Endpoint          | Description |
|--------|------------------|-------------|
| POST   | `/user/save`      | Saves a new user to the database |
| GET    | `/user/getusers`  | Retrieves all users |
| GET    | `/user/{id}`      | Retrieves a user by ID |
| PUT    | `/user/update/{id}` | Updates an existing user |
| DELETE | `/user/delete/{id}` | Deletes a user by ID |

## How to Run
1. Clone the repository:
   ```sh
   git clone https://github.com/your-username/your-repo.git
   ```
2. Navigate to the project directory:
   ```sh
   cd your-repo
   ```
3. Build and run the Spring Boot application:
   ```sh
   mvn spring-boot:run
   ```

## working demo
[working](https://www.linkedin.com/in/your-profile)
