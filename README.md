# Big Number Addition Project

## Description
This project implements addition of large numbers represented as strings using the elementary school method (right-to-left addition with carry).

The project includes:
- Task 1: Core library (MyBigNumber)
- Task 2: Web application using Spring Boot + Thymeleaf to display step-by-step calculation

---
---
## How to Run Task 1

```bash
cd TASK1
mvn clean install
````

This will generate a JAR file for reuse in Task 2.

---

## How to Run Task 2

```bash
cd TASK2
mvn spring-boot:run
```

Open browser:

```
http://localhost:8080
```

---

## Input Example

```
A = 1234
B = 897
```

## Output Example

```
Start sum: 1234 + 897
Step 1: ...
Step 2: ...
Final result = 2131
```

---

## Requirements

* Java 17+
* Maven 3+
* Spring Boot 3.x
