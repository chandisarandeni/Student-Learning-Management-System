# Student Learning Management System (SLMS)

## Project Overview

The **Student Learning Management System (SLMS)** is a comprehensive platform designed to manage student and lecturer information, including registration, course management, and grading. The system is built using **Java**, integrated with a **SQL Server** database, and created using **Ant Build** for project management and automation.

## Features

1. **Student Registration**
   - Fields: `Student ID`, `Name`, `Address`, `Birthday`, `Email`
   - Database Columns: `studentID`, `studentName`, `studentAddress`, `DOB`, `studentEmail`

2. **Lecturer Registration**
   - Fields: `Lecturer ID`, `Name`, `Subject`, `Department`, `Email`, `Password`, `Confirm Password`, `Secret Pin`
   - Database Columns: `lecturerID`, `lecturerName`, `lecturerSubject`, `department`, `lecturerEmail`, `lecturerPassword`, `secretPin`

3. **Grade Calculation**
   - Grading system based on marks:
     - Marks >= 80: A+
     - Marks >= 70: A
     - Marks >= 65: B+
     - Marks >= 60: B
     - Marks >= 55: B-
     - Marks >= 50: C+
     - Marks >= 45: C-
     - Marks < 45: D
   - Grades are stored in the `grade` column of the database.

4. **Admin Dashboard**
   - Admins can view and manage student data, including recent students from the `tbl_RecentStudents` table.

## Project Setup

### Prerequisites

- **Java Development Kit (JDK)**
- **SQL Server** and **SQL Server Management Studio (SSMS)**
- **Apache Ant** (used for building the project)

### Database Setup

Before running the project, ensure that the necessary tables are created in the SQL Server database. Follow these steps:

1. Open **SQL Server Management Studio (SSMS)**.
2. Run the provided table creation queries to set up the database and tables required for the system.

### Table Creation Queries

Make sure to execute the following table creation queries in SSMS to create the required database and tables:

```sql
-- CREATING THE DATABASE
CREATE DATABASE OOP_CW;

-- SELECT DATABASE
USE OOP_CW;

-- CREATE ADMINDATA TABLE
CREATE TABLE adminData(
  adminUsername  NVARCHAR(50) PRIMARY KEY,
  adminName    VARCHAR(255),
  adminPassword  NVARCHAR(50),
  secretPin      NVARCHAR(10)
);

-- CREATE STUDENT TABLE
CREATE TABLE Student(
  studentID    NVARCHAR(50) PRIMARY KEY NOT NULL,
  studentName    VARCHAR(255),
  studentAddress  NVARCHAR(255),
  DOB        NVARCHAR(20),
  studentEmail  NVARCHAR(255),
  studentPassword  NVARCHAR(50),
  secretPin      NVARCHAR(10)
);

-- CREATE LECTURER TABLE
CREATE TABLE Lecturer(
  lecturerID    NVARCHAR(50) PRIMARY KEY NOT NULL,
  lecturerName  VARCHAR(255),
  lecturerSubject  NVARCHAR(100),
  department    VARCHAR(50),
  lecturerEmail  NVARCHAR(255),
  lecturePassword  NVARCHAR(255),
  secretPin      NVARCHAR(10)
);

-- CREATE COURSE TABLE
CREATE TABLE Course(
  courseID  NVARCHAR(50) PRIMARY KEY NOT NULL,
  courseName  NVARCHAR(50),
  department  NVARCHAR(50)
);

-- CREATE RESULT TABLE
CREATE TABLE Result(
  studentID  NVARCHAR(50),
  FOREIGN KEY (studentID) REFERENCES Student(studentID),
  subjectName  NVARCHAR (50),
  marks    REAL,
  grade    CHAR(2)
);

```
##

### Running the Project

1. Make sure **Apache Ant** is installed on your machine.
    
2. Navigate to the project directory and build the project using the following command:
    
    ```bash
    ant build
    ```

3. Once the build is successful, deploy and run the application.

##
