Student Management System

📌 Project Description

The Student Management System is a Java-based console application designed to manage engineering student records. The system allows users to add student details and display all stored student information.

This project demonstrates core Object-Oriented Programming (OOP) concepts in Java, including Abstraction, Encapsulation, Inheritance, and Polymorphism.

---

🚀 Features

- Add new student records
- Store student details such as:
  - Name
  - USN (University Seat Number)
  - Marks
  - Branch
- Display all student records
- Automatically calculate student grades based on marks
- Menu-driven console interface

---

🛠️ Technologies Used

- Programming Language: Java
- Concepts Implemented:
  - Abstraction
  - Encapsulation
  - Inheritance
  - Polymorphism
  - ArrayList Data Structure

---

📂 Project Structure

StudentManagementSystem/
│
├── StudentManagementSystem.java
└── README.md

---

⚙️ How to Run the Project

Step 1: Clone the repository

git clone https://github.com/YOUR_USERNAME/Student-Management-System.git

Step 2: Navigate to the project folder

cd Student-Management-System

Step 3: Compile the Java file

javac StudentManagementSystem.java

Step 4: Run the program

java StudentManagementSystem

---

🖥️ Sample Output

---Student Management System---

1.Add Student
2.Display All Students
3.Exit

Enter choice: 1

Enter Name: Srishti
Enter USN: 12345
Enter Marks: 85
Enter Branch: CSE

Student added successfully

Displaying student details:

Name: Srishti
USN: 12345
Marks: 85
Branch: CSE
Grade: A(Engineering)

---

📚 OOP Concepts Used

Abstraction

Implemented using the abstract "Person" class, which defines the structure for student details.

Encapsulation

Student marks are kept private and accessed using getter and setter methods.

Inheritance

"EngineeringStudent" inherits properties and methods from "BaseStudent".

Polymorphism

The "calculateGrade()" and "displayDetails()" methods are overridden in the child class.

---

🔮 Future Enhancements

- Add database connectivity (MySQL)
- Add update and delete student records
- Add search functionality
- Create a graphical user interface (GUI)
- Export student reports

