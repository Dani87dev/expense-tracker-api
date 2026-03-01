# Expense Tracker API

Simple REST API built with Spring Boot to manage expenses.

This project was created as a first backend practice using Spring Boot, following a layered architecture (Controller → Service → Repository → Model).

---

## 🚀 Tech Stack

- Java 17+
- Spring Boot
- Maven
- Embedded Tomcat
- In-memory data storage (List)

---

## 📁 Project Structure

```
com.dani.expensetracker
│
├── controller
│   └── ExpenseController
│
├── service
│   └── ExpenseService
│
├── repository
│   └── ExpenseRepository
│
├── model
│   └── Expense
│
└── ExpensetrackerApplication
```

---

## 📌 Features

- Create expense
- Get all expenses
- Get expense by ID
- Update expense
- Delete expense
- Proper HTTP status codes (200, 201, 404)

---

## 📡 API Endpoints

### Get all expenses

```
GET /expenses
```

### Get expense by ID

```
GET /expenses/{id}
```

Returns:
- 200 OK
- 404 Not Found

### Create expense

```
POST /expenses
```

Body (JSON):

```json
{
  "description": "Lunch",
  "amount": 12.50,
  "category": "Food",
  "date": "2025-03-01"
}
```

Returns:
- 201 Created

### Update expense

```
PUT /expenses/{id}
```

Returns:
- 200 OK
- 404 Not Found

### Delete expense

```
DELETE /expenses/{id}
```

Returns:
- 200 OK
- 404 Not Found

---

## ▶ How to Run

1. Clone the repository
2. Open in IntelliJ
3. Run `ExpensetrackerApplication`
4. Server runs on:

```
http://localhost:8080
```

---

## ⚠️ Notes

- Data is stored in memory (no database).
- All data resets when the application restarts.
- This is a learning project to understand Spring Boot fundamentals.

---

## 📚 Learning Goals

- Understand Spring Boot architecture
- Practice Dependency Injection
- Build a REST API
- Work with HTTP status codes
- Apply layered architecture principles
