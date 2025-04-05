# TaskSphereAPI

TaskSphereAPI is a collaborative task management RESTful API built with Spring Boot. It allows users to register,
authenticate, and manage tasks assigned to their accounts.

## ✨ Features

- ✅ Create user
- ✅ List all users
- ✅ Update and delete user
- ✅ Find user by ID
- 🔒 JWT authentication (coming soon)
- 📋 Task management per user (coming soon)

## 🔧 Technologies

- Java 17
- Spring Boot
- Spring Data JPA
- PostgreSQL
- Lombok
- Maven

## 🚀 Getting Started

To run this project locally, follow the steps below.

### Prerequisites

- Java 17
- Maven
- PostgreSQL database

### Clone the repository

```bash
git clone https://github.com/PhellipeLisboa/TaskSphereAPI.git
cd TaskSphereAPI
```

### Set up the database

Create a PostgreSQL database and update the connection credentials in the `src/main/resources/application.properties` file.

```properties
spring.datasource.url=jdbc:postgresql://localhost:5432/tasksphere
spring.datasource.username=your_username
spring.datasource.password=your_password
```

### Run the application

```bash
./mvnw spring-boot:run
```
The API will start at: `http://localhost:8080`

## 📚 API Endpoints

### 👤 User Endpoints

#### Create User
**POST** `/users`

**Request Body**
```json
{
  "name": "John Doe",
  "email": "john.doe@example.com"
}
```

**Response**
```json
{
  "id": 1,
  "name": "John Doe",
  "email": "john.doe@example.com"
}
```

---

#### List All Users
**GET** `/users`

**Response**
```json
[
  {
    "id": 1,
    "name": "John Doe",
    "email": "john.doe@example.com"
  },
  {
    "id": 2,
    "name": "Jane Smith",
    "email": "jane.smith@example.com"
  }
]
```

---

#### Find User by ID
**GET** `/users/{id}`

**Response**
```json
{
  "id": 1,
  "name": "John Doe",
  "email": "john.doe@example.com"
}
```

---

#### Update User
**PUT** `/users/{id}`

**Request Body**
```json
{
  "name": "Updated Name",
  "email": "updated.email@example.com"
}
```

**Response**
```json
{
  "id": 1,
  "name": "Updated Name",
  "email": "updated.email@example.com"
}
```

---

#### Delete User
**DELETE** `/users/{id}`

**Response**  
HTTP 204 No Content

## 🔐 Authentication (coming soon)

In the next steps of this project, a JWT-based authentication system will be implemented. Users will be able to:

- Register an account
- Log in to receive a JWT token
- Use the token to access protected endpoints

More information will be added once the authentication is fully implemented.

---

## ✅ Task Management (coming soon)

Each authenticated user will be able to manage their own tasks. Planned features include:

- Create, read, update and delete tasks
- Associate tasks to a specific user
- Mark tasks as completed or pending
- Filter tasks by status or due date

Documentation will be updated as these features are added to the project.

---

## 📄 License

This project is licensed under the [MIT License](LICENSE).