# Employee Management System (Java + MySQL)

Employee Management System is a **Java console-based application** that allows users to manage employee records efficiently using a **MySQL database**.
The project demonstrates a **layered architecture** including models, services, utilities, and exception handling.

This system performs basic employee operations such as adding, retrieving, and managing employee information stored in a database.

---

## Features

* Add new employees
* View employee details
* Update employee information
* Delete employee records
* Exception handling for invalid employee operations
* Database connectivity using MySQL

---

## Tech Stack

**Programming Language**

* Java

**Database**

* MySQL

**Libraries / Tools**

* MySQL Connector J
* JDBC (Java Database Connectivity)

---

## Project Structure

```
EMPLOYEEMANAGEMENTSYSTEM
│
├── exception
│   └── EmployeeNotFoundException.java
│
├── model
│   ├── Employee.java
│   └── Person.java
│
├── service
│   ├── EmployeeService.java
│   └── EmployeeServiceImpl.java
│
├── util
│   └── DBConnection.java
│
├── Main.java
└── mysql-connector-j-8.0.33.jar
```

### Folder Explanation

**exception**

* Custom exception classes used to handle errors such as employee not found.

**model**

* Contains entity classes representing the data structure of employees.

**service**

* Business logic layer that performs operations related to employee management.

**util**

* Utility classes such as database connection handling.

**Main.java**

* Entry point of the application.

---

## Database Setup

Create a MySQL database.

Example:

```sql
CREATE DATABASE employee_db;
```

Create an employee table:

```sql
CREATE TABLE employees (
    id INT PRIMARY KEY AUTO_INCREMENT,
    name VARCHAR(100),
    department VARCHAR(100),
    salary DOUBLE
);
```

Update database credentials in:

```
util/DBConnection.java
```

Example configuration:

```java
String url = "jdbc:mysql://localhost:3306/employee_db";
String username = "root";
String password = "your_password";
```

---

## How to Run the Project

### 1. Clone the repository

```
git clone https://github.com/yourusername/employee-management-system.git
```

### 2. Open the project in an IDE

Recommended IDEs:

* IntelliJ IDEA
* Eclipse
* VS Code (Java Extension)

### 3. Add MySQL Connector

Make sure `mysql-connector-j-8.0.33.jar` is added to the project libraries.

### 4. Compile and Run

Run the `Main.java` file.

---

## Example Operations

* Add Employee
* View Employee Details
* Update Employee Information
* Delete Employee

---

## Learning Outcomes

This project demonstrates:

* Java object-oriented programming
* Layered application architecture
* JDBC database connectivity
* Custom exception handling
* MySQL integration

---

## Author

**Priyansh Singh Gautam**

B.Tech Student
Skills: Java, SQL, Web Development

GitHub
https://github.com/priyanshsinghgautam
