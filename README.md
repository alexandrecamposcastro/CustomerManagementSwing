# Customer Management System (Java Swing & DAO Pattern)

This repository features a professional-grade client management system, focusing on fundamental software engineering concepts such as the **DAO (Data Access Object) pattern**, Separation of Concerns (SoC), and robust exception handling within graphical user interfaces.

## Technical Highlights

Unlike basic CRUD tutorials, this project was architected with scalability and maintainability in mind:

* **Layered Architecture:** Clear distinction between the User Interface (View), Business Rules (Domain), and the Persistence layer (DAO).
* **DAO Pattern:** Abstraction of persistence logic, making it seamless to swap the current in-memory storage for a relational database (SQL) without affecting the UI components.
* **Data Validation:** Implementation of logic to prevent duplicate entries (unique CPF validation) and mandatory field verification.
* **Dynamic UI (Swing):** Utilizes `DefaultTableModel` for real-time table updates and synchronized data display.

## Tech Stack

* **Language:** Java 17+
* **UI Framework:** Java Swing (Desktop)
* **Design Patterns:** Singleton, DAO, and Model-View-Controller (MVC) architectural principles.

## Project Structure

* `br.com.alexandre.domain`: Model classes (Entities).
* `br.com.alexandre.dao`: Interfaces and persistence implementations.
* `br.com.alexandre.swing`: Screens and graphical interface components.

## Installation and Execution

1.  Ensure you have **JDK 17** or higher installed.
2.  Clone the repository:
    ```bash
    git clone [https://github.com/alexandrecamposcastro/CadastroClienteSwing.git](https://github.com/alexandrecamposcastro/CadastroClienteSwing.git)
    ```
3.  Compile the project via terminal or import it into your preferred IDE (IntelliJ IDEA, Eclipse, or NetBeans).
4.  Run the main class:
    ```bash
    java -cp target/classes br.com.alexandre.swing.TelaPrincipal
    ```

## Evolution Roadmap

To maintain the high-end professional portfolio standards, the following enhancements are planned:
- [ ] Database integration via JDBC or JPA/Hibernate.
- [ ] Implementation of Unit Testing with JUnit 5.
- [ ] Export functionality for PDF/CSV reports.

---
Developed by **Alexandre Campos Castro** – Focused on Fullstack Development and Software Engineering.
