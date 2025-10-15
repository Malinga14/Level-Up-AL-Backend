# Level-Up-AL-Backend

A backend service for the Level-Up-AL project, implemented in Java.

## Table of Contents

- [Project Overview](#project-overview)
- [Tech Stack](#tech-stack)
- [Project Structure](#project-structure)
- [Design Patterns](#design-patterns)
- [Security](#security)
- [Getting Started](#getting-started)
- [API Documentation](#api-documentation)
- [Contributing](#contributing)
- [License](#license)
- [Contact](#contact)

---

## Project Overview

Level-Up-AL-Backend provides the foundational backend logic, data management, and API endpoints for the Level-Up-AL application. This backend is designed to be scalable, maintainable, and secure.

## Tech Stack

- **Language:** Java (JDK 23)
- **Frameworks:** Spring Boot (3.3.5)
- **Build Tools:** Maven
- **Database:** MySQL (Connector/J 9.1.0)
- **ORM:** Spring Data JPA
- **API Documentation:** SpringDoc OpenAPI
- **Object Mapping:** ModelMapper
- **Security:** Spring Security, JWT (io.jsonwebtoken)
- **Mail:** Spring Boot Starter Mail, Javax Mail
- **Testing:** JUnit
- **Lombok:** Used for boilerplate code reduction

## Main Dependencies (`pom.xml`)

- `spring-boot-starter-web`: RESTful web services
- `spring-boot-starter-data-jpa`: ORM and database integration
- `spring-boot-starter-security`: Authentication and authorization
- `spring-boot-starter-mail` and `javax.mail`: Email sending support
- `mysql-connector-j`: MySQL connectivity
- `modelmapper`: DTO/entity conversion
- `springdoc-openapi-starter-webmvc-ui`: API documentation (Swagger UI)
- `lombok`: Reduces boilerplate code
- `jjwt-api`, `jjwt-impl`, `jjwt-jackson`: JWT authentication

## Project Structure

```
Level-Up-AL-Backend/
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── lk/edu/icet110/
│   │   │        ├── config/          # Configuration classes (Security, ApplicationConfig, etc.)
│   │   │        ├── service/         # Service interfaces and implementations
│   │   │        ├── repository/      # JPA repositories
│   │   │        ├── entity/          # JPA entities
│   │   │        ├── dto/             # Data Transfer Objects
│   │   │        ├── auth/            # Authentication DTOs
│   │   │        └── demo/            # Demo controller
│   │   └── resources/
│   │       └── application.properties
│   └── test/
│       └── java/
├── pom.xml
└── README.md
```

- **src/main/java/lk/edu/icet110/config**: Application and security configuration beans
- **src/main/java/lk/edu/icet110/service**: Service interfaces and implementations (business logic)
- **src/main/java/lk/edu/icet110/repository**: Data access layer using Spring Data JPA
- **src/main/java/lk/edu/icet110/entity**: JPA entity classes for DB tables
- **src/main/java/lk/edu/icet110/dto**: DTOs for request/response models
- **src/main/java/lk/edu/icet110/auth**: Authentication-related DTOs (JWT)
- **src/main/java/lk/edu/icet110/demo**: Example controller

## Design Patterns

- **Singleton**: Beans defined with `@Configuration` and `@Bean` are singletons in Spring's context (e.g., ModelMapper, PasswordEncoder).
- **Factory**: Bean methods in configuration classes provide factory-like instantiation.
- **Repository**: All database access follows the Repository pattern (`StudentRepository`, `UserRepository`, etc.).
- **Service Layer**: Business logic encapsulated in service classes (`StudentServiceImpl`, `AuthenticationService`).
- **DTO Pattern**: Separation of entity and transport layer objects.
- **Builder**: Used with Lombok's `@Builder` for creating complex objects.
- **Controller**: REST endpoints via `@RestController`.

## Security

Implemented using industry standards and best practices:

- **Spring Security**: Centralized authentication and authorization.
- **JWT Authentication**: Secure stateless authentication using JSON Web Tokens (see `JwtService`, `AuthenticationService`, `SecurityConfiguration`).
- **Password Hashing**: Passwords are hashed using BCrypt (`PasswordEncoder` bean), never stored in plaintext.
- **Role-based Access Control**: User roles managed via JPA entities.
- **CORS Configuration**: Restricted origins and HTTP methods for API access (`SecurityConfiguration`).
- **Custom AuthenticationProvider**: Uses DAO and custom UserDetailsService.
- **Session Management**: Stateless (JWT), avoids server-side sessions.
- **Error Handling**: Exception handling for authentication errors (`UsernameNotFoundException`, etc.).
- **Environment-based Configuration**: Uses `application.properties`.

## Getting Started

1. **Clone the repo:**
   ```bash
   git clone https://github.com/Malinga14/Level-Up-AL-Backend.git
   ```

2. **Install dependencies:**  
   Use Maven to install project dependencies.

3. **Configure the application:**  
   - Edit `src/main/resources/application.properties` for DB and mail settings.

4. **Run the application:**  
   ```bash
   ./mvnw spring-boot:run
   ```

## API Documentation

- Swagger UI available via SpringDoc OpenAPI (`springdoc-openapi-starter-webmvc-ui`).
- Access documentation at `/swagger-ui/index.html` after running the app.

## Contributing

1. Fork the repository
2. Create your feature branch (`git checkout -b feature/AmazingFeature`)
3. Commit your changes (`git commit -m 'Add some AmazingFeature'`)
4. Push to the branch (`git push origin feature/AmazingFeature`)
5. Open a Pull Request

## License

(Add your project license here.)

## Contact

- [GitHub Profile](https://github.com/Malinga14)

---

*Feel free to modify this README to better fit the specifics of your project, especially the tech stack, design patterns, and security sections based on your actual implementation.*
