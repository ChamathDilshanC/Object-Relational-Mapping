# Object-Relational-Mapping (ORM)

![GitHub last commit](https://img.shields.io/github/last-commit/ChamathDilshanC/Object-Relational-Mapping) 

An implementation of Object-Relational Mapping (ORM) that bridges the gap between relational databases and object-oriented programming. This project is designed to simplify database operations and improve productivity by automating the process of database mapping to objects.

## 🌟 Features

- **Automatic Mapping**: Converts relational database tables into Java objects and vice versa.
- **CRUD Support**: Easily manage Create, Read, Update, and Delete operations with minimal boilerplate code.
- **Transaction Management**: Ensure data integrity with transaction handling.
- **Custom Queries**: Support for custom SQL queries alongside the automated ORM operations.
- **Scalable**: Designed to handle small to large scale database interactions efficiently.

## ⚙️ Technologies Used

- **Java**: Core language for ORM implementation.
- **JDBC**: For direct database communication.
- **MySQL**: Database used for testing ORM functionalities.
- **Maven**: Dependency management.
- **JUnit**: Unit testing framework.

## 🚀 Getting Started

### Prerequisites

- Java 11+
- Maven
- MySQL database

### Installation

1. Clone the repository:
   ```bash
   git clone https://github.com/ChamathDilshanC/Object-Relational-Mapping.git
   ```

2. Navigate to the project directory:
   ```bash
   cd Object-Relational-Mapping
   ```

3. Install dependencies:
   ```bash
   mvn clean install
   ```

4. Configure your MySQL database in the `application.properties` file:
   ```properties
   spring.datasource.url=jdbc:mysql://localhost:3306/your_db_name
   spring.datasource.username=your_username
   spring.datasource.password=your_password
   ```

5. Run the application:
   ```bash
   mvn spring-boot:run
   ```

## 🛠️ Usage

- Define your entity classes that map to the database tables.
- Perform CRUD operations with simple method calls.
- Execute custom queries using the ORM query builder or native SQL.

### Example:

```java
@Entity
public class User {
    @Id
    private Long id;
    private String name;
    private String email;
    
    // Getters and Setters
}

// Usage in service
User user = new User();
user.setName(" Chamath Dilshan");
userRepository.save(user); // Saves user to DB
```

## 📄 License

This project is licensed under the MIT License - see the [LICENSE](./LICENSE) file for details.

## 👨‍💻 Author

- **Chamath Dilshan** - [GitHub Profile](https://github.com/ChamathDilshanC)
