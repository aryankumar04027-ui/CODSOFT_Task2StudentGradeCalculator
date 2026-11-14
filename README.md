# Student Grade Calculator

A Java console program that calculates a student's total marks, average percentage and grade from the marks obtained in each subject.

Built as **Task 2** of the **CodSoft Java Programming Internship**.

## Features

- Enter the student's name and the number of subjects
- Enter the subject names and the marks obtained (out of 100) in each
- Calculates the **total marks**
- Calculates the **average percentage**
- Assigns a **grade** and a remark based on the average
- Shows the results as a clear, formatted report card
- Checks the input and asks again for wrong values (text, or marks outside 0–100)

## Grade Scale

| Average Percentage | Grade | Remark |
|---|---|---|
| 90 – 100 | A+ | Outstanding |
| 80 – 89 | A | Excellent |
| 70 – 79 | B | Very Good |
| 60 – 69 | C | Good |
| 50 – 59 | D | Satisfactory |
| 40 – 49 | E | Pass |
| Below 40 | F | Fail |

## Technologies Used

- Java (JDK 8 or later)
- `java.util.Scanner` for user input
- IntelliJ IDEA

## How to Run

```bash
javac StudentGradeCalculator.java
java StudentGradeCalculator
```

Or open the project in IntelliJ IDEA, right-click `StudentGradeCalculator.java` and choose **Run**.

## Sample Output

```
==========================================
        STUDENT GRADE CALCULATOR
==========================================
Enter student name: Ravi
Enter number of subjects: 3
Enter name of subject 1: Maths
Enter marks obtained in Maths (0-100): 95
Enter name of subject 2: Science
Enter marks obtained in Science (0-100): 88
Enter name of subject 3: English
Enter marks obtained in English (0-100): 76

================ RESULT ==================
Student: Ravi
------------------------------------------
Subject                        Marks
Maths                             95
Science                           88
English                           76
------------------------------------------
Total Marks                  259 / 300
Average Percentage            86.33%
Grade                              A
Remark: Excellent!
==========================================
```

## Concepts Practised

Arrays, loops, conditional statements, methods, `switch`, input validation, exception handling (`NumberFormatException`) and formatted output with `printf`.

## Acknowledgement

Thanks to **CodSoft** for the opportunity to work on this project during the Java Programming Internship.
