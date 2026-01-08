 Attendance Calculator (Java)

A simple Java console application that calculates course attendance and determines whether a student needs to attend upcoming classes or can safely skip them based on a required attendance percentage.

The project follows a **strict layered architecture** to demonstrate clean code practices, even for a small application.


 Features

* Calculates attendance percentage per course
* Indicates how many classes must be attended to meet the criteria
* Indicates how many classes can be skipped without falling below the criteria
* Validates input to prevent invalid attendance data


 Project Structure

```
attendancecalculator/
├── model/
│   └── Course.java
├── service/
│   └── AttendanceService.java
├── ui/
│   └── ConsoleUI.java
└── App.java
```

This structure separates **data**, **business logic**, and **user interaction**, making the code easier to read, maintain, and extend.



 How to Run

```bash
javac App.java
java App
```



 Concepts Used

* Java OOP principles
* Layered architecture
* Consolebased user interaction
* Basic input validation


