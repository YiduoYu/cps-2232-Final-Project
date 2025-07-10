# cps-2232-Final-Project —— **Car Rental Management System (CRMS)**

## **Project Overview**

The **Car Rental Management System (CRMS)** is a Java-based application designed to streamline operations and enhance user experience in the car rental industry. This system serves both **administrators** (car rental companies) and **customers**, offering intuitive interfaces for managing vehicles, processing rental transactions, and handling user authentication.


## **Key Features**

### **1. User Roles & Authentication**

* **Administrator**

  * Manage the vehicle inventory (add, update, delete).
  * View rental transaction logs.
  * Maintain customer accounts.
* **Customer**

  * Register and log in to the system.
  * Browse available vehicles.
  * Rent and return vehicles.

---

### **2. Vehicle Management**

* Administrators can:

  * Add, view, update, and delete vehicle records.
* Each vehicle includes attributes such as:

  * Brand, model, color, capacity, rental price, size, and availability status.

---

### **3. Rental Transactions**

* Customers can rent and return vehicles.
* Vehicle availability is automatically updated based on transactions.
* All rental activities are logged and recorded in the system.

---

### **4. Notification System**

* Integrated with the **JavaMail API**.
* Sends rental confirmations and account-related notifications via email.

---

### **5. Persistent Storage**

* File-based storage is used for data management:

  * **Vehicles.txt** – Stores all vehicle information.
  * **Accounts.txt** – Stores user account data.
  * **Log.txt** – Maintains all transaction logs.

---

## **Technologies Used**

* **Java** – Core programming language.
* **JavaMail API** – For sending email notifications.
* **ArrayList** – Used for dynamic data manipulation.
* **File I/O** – For persistent file-based data storage.

---

## **Project Structure**

* **CarRentalManagementSystem.java** – Main class; handles user interaction and system initialization.
* **RentalManager.java** – Manages rentals, vehicle availability, and email notifications.
* **User.java** – Defines user properties and handles login/authentication.
* **Vehicle.java** – Defines vehicle attributes and availability status.

---

## **Installation & Usage**

### **Requirements**

* Java SE (Version 8 or above)
* JavaMail API

### **Setup**

1. Clone the repository or download the source code.
2. Ensure the following files exist in the project root directory:

   * `Vehicles.txt`
   * `Accounts.txt`
   * `Log.txt`
3. Configure SMTP server details in the `RentalManager.java` file for email notifications.

### **Running the Application**

Compile the source files:

```bash
javac *.java
```

Run the main program:

```bash
java CarRentalManagementSystem
```

---

## **Functionalities**

### **Admin Features**

* Add or delete vehicle records.
* View all vehicles.
* Access complete rental transaction logs.

### **Customer Features**

* Create an account and log in.
* Browse available cars for rent.
* Rent and return vehicles.
* Receive transaction confirmation emails.

---

## **Future Enhancements**

* Improve the stability and reliability of email notifications.
* Add advanced vehicle search and filtering options.
* Expand the system with more sophisticated management features (e.g., payment integration, analytics dashboard).

---

## **Contribution of Group Members**

| Name           | Student Number | Contribution                                                                              |
| -------------- | -------------- | ----------------------------------------------------------------------------------------- |
| **Mi Yixuan**  | 1307943        | Created UML master table, integrated code, debugged project, wrote the report.            |
| **Yu Yiduo**   | 1306057        | Designed the `CarRentalManagementSystem` class, contributed to report writing.            |
| **Zhao Yiyi**  | 1305974        | Developed the `RentalManager` class, contributed to report writing.                       |
| **Yu Qiyang**  | 1306031        | Designed the `User` class and user data structure, contributed to report writing.         |
| **Jia Taoyin** | 1306194        | Designed the `Vehicle` class and managed vehicle database, contributed to report writing. |



