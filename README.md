# Webook Project

## Overview
Webook is a web automation project designed for testing web applications using Selenium and Java. It is a Maven-based project that includes automated test scenarios for the following functionalities:
- **User Registration**
- **User Search**

This project leverages the TestNG testing framework for organizing and running test cases.

---

## Features
- Automates web application testing using **Selenium WebDriver**.
- Includes modular and reusable code for better maintainability.
- Supports parameterized and data-driven testing through **TestNG**.

---

## Prerequisites
To set up and run the Webook project, ensure the following tools and dependencies are installed on your system:

### **Tools Required**
1. **Java Development Kit (JDK)**:
   - Version: **15**
   - Configure the `JAVA_HOME` environment variable.
2. **Maven**:
   - Ensure Maven is installed and added to the system `PATH`.
3. **Integrated Development Environment (IDE)**:
   - Recommended: **IntelliJ IDEA** (or any IDE that supports Java and Maven).
4. **Web Browser**:
   - Supported browsers include Chrome, Firefox, etc.
   - Ensure you have the appropriate browser driver (e.g., ChromeDriver, GeckoDriver).
5. **Git**:
   - Clone the repository using Git.

---

## Project Structure
```
Webook/
├── src/
│   ├── main/
│   │   ├── java/org/example/
│   │   │   ├── BasePage.java
│   │   │   ├── HomePage.java
│   │   │   ├── RegistrationPage.java
│   │   │   ├── SearchPage.java
│   │   └── resources/
│   │       ├── data.json
│   │       └── testng.xml
│   └── test/
│       ├── java/org/example/
│       │   ├── BaseTest.java
│       │   ├── Register.java
│       │   └── UserSearch.java
├── pom.xml
└── README.md
```

### **Key Files**
- **`pom.xml`**: Contains Maven dependencies and build configurations.
- **`testng.xml`**: TestNG configuration file to manage and execute test cases.

---

## Scenarios Implemented
1. **Register Test Case**:
   - Automates the user registration flow, verifying successful registration of a user.
2. **User Search Test Case**:
   - Automates searching for a user within the application and validates the results.

---

## Setup Instructions
1. **Clone the Repository**:
   ```bash
   git clone https://github.com/mahmoud-anwar16/webook-web.git
   cd webook-web
   ```

2. **Install Dependencies**:
   Run the following Maven command to download and install project dependencies:
   ```bash
   mvn clean install
   ```

3. **Configure Web Drivers**:
   - Download the browser driver (e.g., ChromeDriver for Google Chrome).
   - Add the driver to your system `PATH`.

---

## How to Run
1. **Run Test Cases via TestNG**:
   - Open the `testng.xml` file in your IDE.
   - Right-click and select **Run**.

2. **Run Test Cases via Maven**:
   ```bash
   mvn test
   ```

---

## Dependencies
The project uses the following Maven dependencies:
- **Selenium Java**: Browser automation library.
- **TestNG**: Testing framework for organizing test cases.

These dependencies are declared in the `pom.xml` file.

---------
