# 🏥 Hospital Management System (Spring Core)

A simple **Spring Core (Annotation-based)** project demonstrating Dependency Injection (DI) and Component Scanning using a Hospital Management scenario.

---

## 📌 Overview

This project simulates a basic hospital system where:

* A **Doctor** treats a **Patient**
* Both are managed inside a **Hospital**
* Dependencies are injected using **Spring Framework (Core)**

It’s a beginner-friendly project to understand:

* Spring IoC Container
* Dependency Injection (Setter Injection)
* Component Scanning
* Annotation-based configuration

---

## 🛠️ Technologies Used

* Java
* Spring Core Framework
* Eclipse IDE (or any Java IDE)

---

## 📂 Project Structure

```
com.nit
│
├── config
│   └── AppConfig.java
│
├── main
│   └── TestHospitalManagement.java
│
└── sbeans
    ├── Doctor.java
    ├── Patient.java
    └── Hospital.java
```

---

## ⚙️ Configuration

### AppConfig.java

* Enables component scanning for Spring Beans
* Uses `@Configuration` and `@ComponentScan`

👉 Source: 

---

## 🧩 Components

### 👨‍⚕️ Doctor

* Contains:

  * name
  * specialization
* Marked as `@Component("doc")`

👉 Source: 

---

### 🧑 Patient

* Contains:

  * name
  * disease
* Marked as `@Component("pat")`

👉 Source: 

---

### 🏥 Hospital

* Contains:

  * hospital name
  * Doctor (Autowired)
  * Patient (Autowired)
* Uses **Setter Injection with `@Autowired`**

👉 Source: 

---

## 🚀 Main Class

### TestHospitalManagement.java

* Loads Spring Container using `AnnotationConfigApplicationContext`
* Retrieves beans
* Sets values dynamically
* Prints hospital details

👉 Source: 

---

## ▶️ How to Run

1. Clone the repository
2. Open in Eclipse / IntelliJ
3. Add Spring Core dependencies (if not already added)
4. Run:

```
TestHospitalManagement.java
```

---

## 🧪 Sample Output

```
Hospital =City Hospital
Doctor=Dr. Sharma (Cardiologist)
Patient= Amit Disease=(Heart Problem)
```

---

## 🎯 Key Concepts Demonstrated

* ✔️ Spring IoC Container
* ✔️ Dependency Injection (Setter-based)
* ✔️ Annotation Configuration
* ✔️ Component Scanning
* ✔️ Loose Coupling

---

## 📚 Learning Purpose

This project is ideal for:

* Beginners learning Spring Framework
* Understanding how beans are managed
* Practicing real-world object relationships

---

## ✨ Future Improvements

* Add Constructor Injection
* Introduce Interfaces (for better abstraction)
* Add Spring Boot version
* Connect to database (JDBC / JPA)

---

## 🤝 Contributing

Feel free to fork this repo and improve it!

---

## 📄 License

This project is for educational purposes.

---

⭐ If you found this helpful, consider giving it a star!
