![Main Code](https://github.com/Husnainarain2/Libarary/blob/main/Assets/Screenshot%202026-02-07%20125107.png);
![Library Class](https://github.com/Husnainarain2/Libarary/blob/main/Assets/Screenshot%202026-02-07%20125125.png);
![Library Class](https://github.com/Husnainarain2/Libarary/blob/main/Assets/Screenshot%202026-02-07%20125138.png);

## 📚 Library Management System (Java)

A simple Java-based Library Management System demonstrating core Object-Oriented Programming (OOP) concepts such as classes, objects, arrays, and methods.

This project allows users to:

Add books to the library

View available books

Issue books

Return books

## 🚀 Features

📖 Add new books to the library

👀 Display all available books

📤 Issue a book (remove from availability)

📥 Return a book (add back to library)

🔒 Prevent adding books when library is full

## 🛠️ Technologies Used

Java

Arrays

OOP Concepts

Classes & Objects

Methods

Encapsulation (basic)

## 📂 Project Structure
LibraryManagement/
│
├── Library.java   // Contains library logic
├── Main.java      // Program execution (main method)
└── README.md      // Project documentation

## ▶️ How to Run the Project

Make sure Java (JDK) is installed

Compile the code:

javac Main.java


Run the program:

java Main

## 🧠 How It Works

The library stores books in a fixed-size array.

count keeps track of the total books added.

When a book is issued, its position is set to null.

Returned books are added again using the addBook() method.

## 📝 Sample Output
Book Add successFully:
Book Add successFully:
Book Add successFully:
Avaliable Book
- Java
- C++
- Python
Java Book successFully
Avaliable Book
- C++
- Python
Java returned successfully
Avaliable Book
- C++
- Python
- Java
