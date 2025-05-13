# 🛒 TutorialNinja eCommerce Automation Testing 🚀

This project contains an automated test script using **Java + Selenium WebDriver + TestNG** to simulate a real user purchasing a mobile phone on the [TutorialNinja Demo Website](https://tutorialsninja.com/demo/).

---

## 📌 Project Overview

This automation script performs a full **end-to-end testing scenario** of:
- Navigating the homepage
- Selecting a product
- Writing a review
- Modifying quantity
- Adding the product to the shopping cart
- Taking a screenshot of the final cart

It is written using modern automation best practices, including the **Page Object Model (POM)** pattern and utility classes.

## ⚙️ Highlights
- ✅ Page Object Model (POM) Design
- 🧠 Dynamic Waits & Scrolling with JavascriptExecutor
- 🖱️ Mouse Hover Actions using Actions class
- 📷 Screenshot Capture using Selenium
- 📑 TestNG for structured test case execution
- 🔄 Reusable Base Class for setup and teardown

TutorialNinjaAutomation :

├── Baseclass.java  : Setup and teardown of WebDriver

├── Pages.java      : Page Object Model (all web element interactions)

├── Test.java       : TestNG test file that calls Pages methods


## 🧰 Technologies Used

| Tool / Library         | Purpose                                      |
|------------------------|----------------------------------------------|
| Java                   | Programming Language                         |
| Selenium WebDriver     | Browser automation                           |
| TestNG                 | Test case framework                          |
| WebDriverManager       | Driver management                            |
| Apache Commons IO      | File handling (for screenshots)              |
| ChromeDriver           | Browser driver                               |
| PageFactory            | Object repository management via annotations |
| JavaScriptExecutor     | Page scrolling                               |
| Actions Class          | Mouse hover and interactions                 |
