# Assignment #2 — Factory Method & Abstract Factory

**Course:** Software Design Patterns 
**Student:** Zhanshuak Nurlankyzy  
**Group:** SE-2504  

---

## Overview
This repository contains the implementation of **Assignment #2** for the Software Design Patterns course. The project demonstrates two key creational design patterns:
1. **Factory Method** (Part A)
2. **Abstract Factory** (Part B)

---

## Project Structure

* **Part A: Factory Method (Logistics Domain)**
  * `Transport` — Product interface defining the contract for transport units.
  * `Truck`, `Ship` — Concrete products implementing `Transport`.
  * `Logistics` — Abstract creator class with the `createTransport()` factory method and core business logic `planDelivery()`.
  * `RoadLogistics`, `SeaLogistics` — Concrete creators instantiating specific transport types.

* **Part B: Abstract Factory (GUI Toolkit Domain)**
  * `Button`, `Checkbox` — Abstract product interfaces for UI components.
  * `WindowsButton`, `WindowsCheckbox`, `WebButton`, `WebCheckbox` — Concrete UI products for Windows and Web platforms.
  * `GUIFactory` — Abstract factory interface declaring creation methods for the UI family.
  * `WindowsFactory`, `WebFactory` — Concrete factories creating platform-consistent UI component sets.

* **Main Entry Point**
  * `Main` — Demonstrates and tests the execution of both design patterns.

---

## How to Run

1. **Open the Project:**
   * Launch **IntelliJ IDEA**.
   * Select **Open** and select the root directory of this repository (`Assignment2_Factory_Patterns`).

2. **Verify JDK Configuration:**
   * Go to **File** -> **Project Structure** -> **Project**.
   * Ensure that **SDK** is set to **Java 17** or higher.

3. **Execute the Code:**
   * Navigate to `src/Main.java` in the project tree.
   * Right-click `Main.java` and select **Run 'Main.main()'** (or click the green **Play** button next to the `main` method).

4. **Expected Output:**
   * The console will display the execution results for both **Part A (Factory Method)** and **Part B (Abstract Factory)**, demonstrating object creation and polymorphic behavior.
  
## Clean Code Principles Applied
   * Meaningful Names: Clear distinction between roles (Creator, Product, Abstract Factory).
   * Elimination of Conditional Logic: Polymorphism replaces if-else / switch type checking.
   * Single Responsibility Principle (SRP): Object construction is isolated inside dedicated factories.
   * Open/Closed Principle (OCP): New transport types or UI platforms can be added without modifying existing client code. 
   * Small Methods: Focused, single-purpose method implementations.
