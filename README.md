# Java Calculator

A simple console-based calculator built with **Java 17** and **Maven**.

## Features

- ➕ Addition
- ➖ Subtraction
- ✖️ Multiplication
- ➗ Division (with divide-by-zero protection)
- 🔢 Modulo (with modulo-by-zero protection)
- Input validation and retry on bad input
- JUnit 5 unit tests

## Project Structure

```
java-calculator/
├── pom.xml
└── src/
    ├── main/java/com/example/
    │   ├── Calculator.java   ← Core math logic
    │   └── Main.java         ← Console UI / entry point
    └── test/java/com/example/
        └── CalculatorTest.java ← JUnit 5 tests
```

## Prerequisites

- [Java 17+](https://adoptium.net/)
- [Maven 3.8+](https://maven.apache.org/download.cgi)

## Commands

| Task              | Command                    |
|-------------------|----------------------------|
| Run the app       | `mvn exec:java`            |
| Run tests         | `mvn test`                 |
| Build JAR         | `mvn package`              |
| Run the built JAR | `java -jar target/java-calculator-1.0-SNAPSHOT.jar` |

## Sample Session

```
╔══════════════════════════╗
║    Java Calculator 1.0   ║
╚══════════════════════════╝

Operations:
  1. Addition       (+)
  2. Subtraction    (-)
  3. Multiplication (*)
  4. Division       (/)
  5. Modulo         (%)
  0. Exit

Choose an operation: 4
Enter first number : 22
Enter second number: 7

  22.0000 / 7.00000 = 3.142857142857143
```

