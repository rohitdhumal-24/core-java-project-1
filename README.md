# Aadhar-PAN Matching Application

A simple Java-based console application that retrieves and matches Aadhar and PAN details based on the provided Aadhar number.

##  Overview

This project demonstrates the functionality of fetching and matching Aadhar and PAN card details. It includes a data access layer for handling Aadhar and PAN data, a service layer for logic, and a presentation layer for user interaction.

 ✨ Features

- Fetch Aadhar Details: Retrieve user details such as name, father’s name, and address using an Aadhar number.
- Fetch PAN Details: Retrieve PAN card details linked to an Aadhar number, including bank details and investments.
- Seamless Matching: Matches Aadhar and PAN details using the provided Aadhar number.
- Interactive Console Interface: Easy-to-use interface for input and output.

🛠️ Technologies Used

- Programming Language: Java
- Data Structures: `HashMap` for storing Aadhar and PAN data

📋 Project Structure
src
├── Project
│   ├── AadharService.java        // Service for Aadhar operations
│   ├── PanService.java           // Service for PAN operations
│   ├── Pan.java                  // Data Access Object (DAO) for PAN details
│   ├── Aadhar.java               // DAO for Aadhar details
│   ├── PanAadharMatcherApp.java  // Main application (Presentation Layer)

 📊 Sample Input/Output

![image alt](https://github.com/rohitdhumal-24/core-java-project-1/blob/6c8f5cfaf385f36dfc2ce9332c3e8b1d39ae57d4/adharPanMatcher.png)
