# Student Record Management System

## Overview
This is a simple console-based Student Record Management System implemented in Java. It allows users to manage student records with basic CRUD (Create, Read, Update, Delete) operations.

## Features
- Add a new student record with ID, name, age, and course.
- Update existing student details.
- Delete a student record by ID.
- View details of a single student by ID.
- View all student records.
- Input validation for numeric fields.

## Project Structure
- `Student.java`: Defines the `Student` class representing a student entity.
- `StudentManagementSystem.java`: Contains the logic for managing student records.
- `Main.java`: Provides a console-based user interface to interact with the system.

## How to Compile and Run

### Prerequisites
- Java Development Kit (JDK) installed (version 8 or above).
- Command line or terminal access.

### Compilation
Open a terminal in the project directory and run:
```bash
javac Student.java StudentManagementSystem.java Main.java
```

### Running the Application
After successful compilation, run the application with:
```bash
java Main
```

## Usage
Follow the on-screen menu to perform operations:
1. Add Student
2. Update Student
3. Delete Student
4. View Student
5. View All Students
6. Exit

Enter the corresponding number to select an option and follow the prompts.

## Testing
The application has been tested for critical-path scenarios including adding, updating, deleting, and viewing student records, as well as input validation.

## Future Enhancements
- Persist data to a file or database.
- Add a graphical user interface (GUI).
- Implement search and filter functionality.
- Add user authentication and role-based access.

## Author
Created by [Utkarsh Singh]

## License
This project is licensed under the MIT License.
