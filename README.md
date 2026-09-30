# 📦 Inventory Management System

A **Java-based Inventory Management System** developed using **Core Java, JDBC, and MySQL**. The project provides a simple way to manage inventory data through database-driven CRUD operations.

## 📌 Project Overview

The Inventory Management System is a console-based Java application that connects to a MySQL database using JDBC.

The application demonstrates how Java can be integrated with a relational database to perform operations such as:

* Adding inventory records
* Viewing inventory records
* Updating inventory information
* Deleting inventory records
* Managing product-related data
* Performing database operations using SQL

This project was developed as a practical application of **Java programming, JDBC, SQL, and database management concepts**.

## 🛠️ Technologies Used

| Technology   | Purpose                             |
| ------------ | ----------------------------------- |
| Java         | Application development             |
| JDBC         | Java–MySQL database connectivity    |
| MySQL        | Database management                 |
| SQL          | Database operations                 |
| Git & GitHub | Version control and project hosting |

## ✨ Features

* ➕ Add inventory records
* 👀 View inventory records
* ✏️ Update inventory details
* 🗑️ Delete inventory records
* 🔗 JDBC-based database connectivity
* 🗄️ MySQL database integration
* 💻 Console-based user interface
* 🔄 CRUD operations

## 📂 Project Structure

```text
InventoryManagementSystem/
│
├── src/
│   └── ...
│
├── lib/
│   └── mysql-connector-j/
│
├── .gitignore
│
└── README.md
```

## ⚙️ Requirements

Before running the project, install:

* Java JDK 8 or above
* MySQL Server
* MySQL Workbench (optional)
* Any Java IDE such as IntelliJ IDEA, Eclipse, or VS Code
* MySQL Connector/J

## 🗄️ Database Setup

### 1. Start MySQL

Make sure your MySQL server is running.

### 2. Create the database

```sql
CREATE DATABASE inventory_management;
```

### 3. Select the database

```sql
USE inventory_management;
```

### 4. Create the required tables

Create the tables according to the SQL queries used in the project.

> **Note:** Update the database name, username, and password in the Java database connection code according to your local MySQL configuration.

Example:

```java
String url = "jdbc:mysql://localhost:3306/inventory_management";
String username = "root";
String password = "your_password";
```

## ▶️ How to Run

### Step 1: Clone the repository

```bash
git clone https://github.com/atlalakshminarsimhareddy/InventoryManagementSystem.git
```

### Step 2: Open the project

Open the project in your preferred Java IDE.

### Step 3: Configure MySQL

Make sure:

* MySQL Server is running
* The database has been created
* Database credentials are correctly configured

### Step 4: Add MySQL Connector

Make sure the MySQL JDBC connector is available in the project classpath.

### Step 5: Run the Java application

Run the main Java class from the `src` folder.

## 🔄 CRUD Operations

The project demonstrates the four basic database operations:

```text
CREATE  → Add inventory data
READ    → View inventory data
UPDATE  → Modify inventory data
DELETE  → Remove inventory data
```

## 🎯 Learning Outcomes

Through this project, I gained practical experience in:

* Core Java programming
* Object-Oriented Programming
* JDBC connectivity
* MySQL database management
* SQL queries
* CRUD operations
* Exception handling
* Connecting Java applications with relational databases
* Using Git and GitHub for project management

## 🚀 Future Improvements

Possible future improvements include:

* Adding a graphical user interface
* Adding user authentication
* Adding inventory search and filtering
* Adding low-stock notifications
* Generating inventory reports
* Adding a web-based interface
* Adding REST APIs using Spring Boot

## 👨‍💻 Author

**Atla Lakshmi Narsimha Reddy**

B.Tech – Computer Science Engineering (Data Science)

GitHub:
https://github.com/atlalakshminarsimhareddy

---

⭐ If you find this project useful, feel free to explore the repository.
