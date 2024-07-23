<html>
<h1 align=center><u>Basic CRUD Spring Boot Project</u></h1>
  <br>
<h2>Introduction</h2>
This is a basic Spring Boot project demonstrating CRUD operations with a MariaDB database. It uses Gradle with Groovy for build and dependency management.
<h2>Features</h2>
•	Create, Read, Update, Delete operations on a sample entity <br>
•	Integration with MariaDB <br>
•	RESTful API endpoints <br>
•	Hot reloading with Spring Boot Dev Tools
  
<h2>Getting Started</h2>
These instructions will help you set up and run the project on your local machine for development and testing purposes.
<h2>Prerequisites</h2>
•	Java JDK 8+
•	Gradle 6+ <br>
•	MariaDB <br>
•	IDE (IntelliJ, Eclipse, etc.) <br>
•	Git <br>

<h2>Installation</h2>
1.	Clone the repository:
sh
Copy code
git clone https://github.com/your-username/your-repo-name.git
2.	Navigate to the project directory:
sh
Copy code
cd your-repo-name
3.	Install the dependencies:
sh
Copy code
./gradlew build

<h2>Running the Application</h2>
You can run the Spring Boot application using the following command:
sh
Copy code
./gradlew bootRun
Alternatively, you can run the application from your IDE by running the main method in the YourApplicationClass.

<h2>Configuration</h2>
Configure the application to connect to your MariaDB database by editing the application.properties file:
<br><br>
spring.datasource.url=jdbc:mariadb://localhost:3306/yourdatabase <br>
spring.datasource.username=root <br>
spring.datasource.password=password <br>
spring.jpa.hibernate.ddl-auto=update <br>
spring.datasource.driver-class-name=org.mariadb.jdbc.Driver <br>
spring.jpa.show-sql=true <br>

<h2>Built With</h2>
•	Spring Boot - The framework used
•	Gradle - Build and dependency management  <br>
•	MariaDB - Database <br>
•	Spring Data JPA - Data persistence <br>
•	Spring Web - Building web, including RESTful, applications <br>
•	Spring Boot Dev Tools - Hot reloading <br>


</html>
