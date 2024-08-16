### Basic CRUD Spring Boot Project

## Introduction
This is a basic Spring Boot project demonstrating CRUD operations with a MariaDB database. It uses Gradle with Groovy for build and dependency management.
## Features
•	Create, Read, Update, Delete operations on a sample entity <br>
•	Integration with MariaDB <br>
•	RESTful API endpoints <br>
•	Hot reloading with Spring Boot Dev Tools
  
## Prerequisites
•	Java JDK 8+
•	Gradle 6+ <br>
•	MariaDB <br>
•	IDE (IntelliJ, Eclipse, etc.) <br>
•	Git <br>

## Configuration
Configure the application to connect to your MariaDB database by editing the application.properties file:
```sh
spring.datasource.url=jdbc:mariadb://localhost:3306/yourdatabase 
spring.datasource.username=root 
spring.datasource.password=password 
spring.jpa.hibernate.ddl-auto=update 
spring.datasource.driver-class-name=org.mariadb.jdbc.Driver 
spring.jpa.show-sql=true 
```

## Built With
•	Spring Boot - The framework used
•	Gradle - Build and dependency management  <br>
•	MariaDB - Database <br>
•	Spring Data JPA - Data persistence <br>
•	Spring Web - Building web, including RESTful, applications <br>
•	Spring Boot Dev Tools - Hot reloading <br>


</html>
