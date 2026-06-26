# 🍔 Online Food Delivery Application

A full-stack **Java Web Application** that enables users to browse restaurants, explore menus, add food items to a session-based shopping cart, place orders, and view their complete order history. The application is built using **Java, JSP, Servlets, JDBC, MySQL, HTML, CSS, and JavaScript** following the MVC architecture.

---

# 📌 Project Overview

The **Online Food Delivery Application** is designed to simplify the online food ordering process by providing an intuitive and responsive platform for customers.

The application allows users to:

* Register and securely log in
* Browse restaurants
* View restaurant menus
* Add items to a shopping cart
* Modify cart quantities
* Checkout and place orders
* Store order information in the database
* View complete order history
* Logout securely

The application uses **HTTP Sessions** to manage user authentication and shopping cart data while **JDBC** handles communication with the MySQL database.

---

# ✨ Features

## 👤 User Module

* User Registration
* Secure Login
* Session Management
* Logout

## 🍽 Restaurant Module

* Display Available Restaurants
* Restaurant Details
* Restaurant Images

## 📋 Menu Module

* Dynamic Menu Display
* Food Images
* Price Display
* Category-wise Menu

## 🛒 Shopping Cart

* Session-Based Cart
* Add to Cart
* Increase Quantity
* Decrease Quantity
* Remove Items
* Automatic Total Calculation

## 💳 Checkout

* Order Summary
* Delivery Address
* Payment Mode Selection
* Place Order

## 📦 Order Management

* Store Orders in Database
* Store Ordered Items
* Generate Order Success Page
* View Complete Order History

---

# 🛠 Tech Stack

### Backend

* Java
* JSP
* Servlets
* JDBC

### Frontend

* HTML5
* CSS3
* JavaScript

### Database

* MySQL

### Server

* Apache Tomcat 10

### IDE

* Eclipse IDE

### Version Control

* Git
* GitHub

---

# 🏛 Project Architecture

```
Presentation Layer
│
├── HTML
├── CSS
├── JavaScript
└── JSP Pages
        │
        ▼
Controller Layer
│
└── Java Servlets
        │
        ▼
Business Logic
│
└── DAO Implementations
        │
        ▼
Data Access Layer
│
└── JDBC
        │
        ▼
MySQL Database
```

---

# 📂 Project Structure

```
OnlineFoodDeliveryApplication
│
├── src
│   ├── dao
│   ├── daoimpl
│   ├── model
│   ├── servlet
│   └── utility
│
├── webapp
│   ├── HTML & CSS
│   ├── Images
│   ├── JSP Pages
│   └── WEB-INF
│
└── Database
```

---

# 🗄 Database Schema

The project uses MySQL with the following tables:

### User

* User ID
* Name
* Email
* Password
* Address

### Restaurant

* Restaurant ID
* Name
* Address
* Rating
* Delivery Time
* Image

### Menu

* Menu ID
* Restaurant ID
* Item Name
* Description
* Price
* Category
* Image

### Order Table

* Order ID
* User ID
* Restaurant ID
* Order Date
* Total Amount
* Status
* Payment Mode

### Order Item

* Order Item ID
* Order ID
* Menu ID
* Quantity
* Price

---

# 📸 Screenshots

Add screenshots inside a folder named **screenshots/**

Suggested screenshots:

* Home Page
* Login Page
* Registration Page
* Restaurant Listing
* Restaurant Menu
* Shopping Cart
* Checkout Page
* Order Success
* Order History

Example:

```
screenshots/
├── home.png
├── restaurants.png
├── menu.png
├── cart.png
├── checkout.png
├── success.png
└── history.png
```

---

# ⚙ Installation & Setup

## Clone Repository

```
git clone https://github.com/rupasree28/OnlineFoodDeliveryApplication.git
```

## Import Project

* Open Eclipse IDE
* Import Existing Maven Project / Dynamic Web Project

## Configure Database

* Install MySQL
* Create the database
* Import the SQL file
* Update database credentials inside:

```
DBConnection.java
```

## Run

* Configure Apache Tomcat
* Deploy the project
* Run on server

Open:

```
http://localhost:8080/OnlineFoodDeliveryApplication
```

---

# 🔄 Application Workflow

```
User Registration/Login
          │
          ▼
Browse Restaurants
          │
          ▼
View Menu
          │
          ▼
Add Items to Cart
          │
          ▼
Update Cart
          │
          ▼
Checkout
          │
          ▼
Place Order
          │
          ▼
Store Order & Order Items
          │
          ▼
Order Success
          │
          ▼
Order History
```

---

# 🚀 Future Enhancements

* Online Payment Gateway Integration
* Email Order Confirmation
* Live Order Tracking
* Google Maps Integration
* Restaurant Admin Dashboard
* Customer Reviews & Ratings
* Wishlist Feature
* Coupon & Discount System
* AI-Based Food Recommendation
* JWT Authentication
* Spring Boot Microservices Migration
* Docker Deployment
* Cloud Deployment (AWS/Azure)

---

# 📚 Key Concepts Implemented

* MVC Architecture
* Session Management
* Object-Oriented Programming
* CRUD Operations
* JDBC Connectivity
* DAO Design Pattern
* Authentication & Authorization
* Shopping Cart Logic
* Order Processing
* Relational Database Design

---

# 👩‍💻 Author

**T. Rupasree**

Final Year B.Tech (Computer Science & Engineering)

GitHub: https://github.com/rupasree28

---

# ⭐ If you found this project useful, consider giving it a Star!
