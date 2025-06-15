# Course Manager Application

![](/assets/Screenshot1.png)

![](/assets/Screenshot2.png)

![](/assets/Screenshot3.png)

![](/assets/Screenshot4.png)

![](/assets/Screenshot5.png)

![](/assets/Screenshot6.png)

![](/assets/Screenshot7.png)

![](/assets/Screenshot8.png)

## Project Description
The Course Manager is a Spring Boot web application that manages courses, teachers, and students. It provides functionality to create, read, update, and delete (CRUD) operations for courses, teachers, and students, with the ability to associate teachers with courses and enroll students in courses.

## Build Tools, Dependencies, and Versions
- **Build Tool**: Maven
- **Java Version**: 17
- **Spring Boot Version**: 3.2.3
- **Key Dependencies**:
  - `spring-boot-starter-web`: Web application support
  - `spring-boot-starter-thymeleaf`: Template engine
  - `spring-boot-starter-jdbc`: JDBC support
  - `mysql-connector-j`: MySQL database connector
  - `spring-boot-starter-test`: Testing support
  - `lombok`: Reduces boilerplate code

## Project Structure
```
classroster/
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── com/sg/classroster/
│   │   │       ├── controllers/    # MVC Controllers
│   │   │       ├── dao/           # Data Access Objects
│   │   │       ├── entities/      # Domain Models
│   │   │       └── ClassRosterApplication.java
│   │   └── resources/
│   │       ├── static/           # Static resources
│   │       ├── templates/        # Thymeleaf templates
│   │       └── application.properties
│   └── test/
│       ├── java/
│       │   └── com/sg/classroster/
│       │       └── dao/          # DAO test classes
│       └── resources/
│           └── application.properties
└── pom.xml
```

## How the Project Interfaces Work Together

### MVC Architecture
1. **Controllers** (`controllers/`)
   - Handle HTTP requests
   - Process form submissions
   - Manage data flow between views and services
   - Main controllers: `CourseController`, `TeacherController`, `StudentController`

2. **Data Access Layer** (`dao/`)
   - Implements database operations
   - Uses Spring JDBC Template for database interactions
   - Main DAOs: `CourseDao`, `TeacherDao`, `StudentDao`

3. **Domain Models** (`entities/`)
   - Represent business objects
   - Define relationships between entities
   - Main entities: `Course`, `Teacher`, `Student`

4. **Views** (`templates/`)
   - Thymeleaf templates for UI rendering
   - Main views: `index.html`, `courses.html`, `teachers.html`, `students.html`

### Data Flow
1. User interacts with web interface
2. Controller receives request
3. Controller uses DAO to perform database operations
4. DAO returns data to Controller
5. Controller adds data to model
6. View renders data using Thymeleaf

## Programming Concepts Used

### Design Patterns
1. **MVC (Model-View-Controller)**
   - Separation of concerns
   - Model: Entity classes
   - View: Thymeleaf templates
   - Controller: Request handling

2. **DAO (Data Access Object)**
   - Abstracts database operations
   - Provides interface for data access
   - Implements CRUD operations

3. **Dependency Injection**
   - Spring's `@Autowired` annotation
   - Loose coupling between components
   - Easier testing and maintenance

### Database Concepts
1. **Relational Database Design**
   - Tables: `course`, `teacher`, `student`, `course_student`
   - Foreign key relationships
   - Many-to-many relationship between courses and students

2. **JDBC Template**
   - Spring's abstraction over JDBC
   - Simplified database operations
   - Exception handling

### Web Development
1. **Thymeleaf Templates**
   - Server-side templating
   - Dynamic content rendering
   - Form handling

2. **Bootstrap**
   - Responsive design
   - UI components
   - Grid system

### Testing
1. **JUnit 5**
   - Unit testing
   - Integration testing
   - Test lifecycle annotations

2. **Spring Test**
   - Spring context testing
   - Database testing
   - Mock testing support

### Security
1. **Input Validation**
   - Form data validation
   - SQL injection prevention
   - XSS prevention

### Best Practices
1. **Code Organization**
   - Package structure
   - Separation of concerns
   - Clean code principles

2. **Error Handling**
   - Exception handling
   - User-friendly error messages
   - Logging

3. **Configuration Management**
   - Properties files
   - Environment-specific settings
   - Database configuration


