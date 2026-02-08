# 🚗 Parking Lot Management System (Core Java)

This is **console-based basic Parking Lot Management System** built using **Core Java**, focused on demonstrating strong fundamentals in **object-oriented programming**, clean logic, and defensive input handling without using any frameworks or databases.

This project simulates a parking lot with a fixed number of slots where vehicles can be parked, removed, and tracked in memory.

---

## ✨ Features

- Create a parking lot with a fixed number of slots  
- Park a vehicle in the **nearest available slot**  
- Remove a vehicle from a specific slot  
- Display current parking lot status  
- Handle edge cases:
  - Parking lot full
  - Invalid menu choice
  - Invalid slot number
  - Non-integer user input  

---

## 🛠️ Technologies Used

- Java (Core Java)
- Java Collections (`List`, `ArrayList`)
- Console I/O (`Scanner`)
- Git & GitHub

---

## 📂 Project Structure
```
java-parking-lot-system/
├── src/
│ ├── Main.java
│ ├── model/
│ │ ├── Vehicle.java
│ │ └── ParkingSlot.java
│ └── service/
│ └── ParkingLot.java
└── README.md
```
---

## ▶️ How to Run

### 1. Compile the project
```bash
javac -d out src/Main.java src/model/*.java src/service/*.java
