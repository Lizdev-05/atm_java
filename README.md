**README**

**Java ATM Operation Interface Implementation Project**

**Introduction:**
This Java project is designed as a learning exercise to understand and implement basic ATM operations. The primary focus is on utilizing Java programming concepts, especially classes, interfaces, and collections. The project aims to simulate common ATM functionalities such as withdrawing, depositing, checking balance, and viewing account statements.

**Project Structure:**
- `AtmOperationInterface`: This interface outlines the basic operations an ATM should support.
  
- `ATM`: This class represents the ATM object and contains attributes like balance.

- `AtmOperationInterfaceImplementation`: This class implements the `AtmOperationInterface` and provides concrete implementations for the ATM operations. It includes methods for withdrawing, depositing, viewing balance, and viewing account statements. The account statements are stored in a `HashMap` for simplicity.

**Getting Started:**
1. **Clone the Repository:**
   ```bash
   git clone https://github.com/Lizdev-05/atm_java.git
   ```

2. **Open in an IDE:**
   Import the project into your preferred Java IDE (Eclipse, IntelliJ, etc.).

3. **Run the Project:**
   Execute the `main` method in a class with the `public static void main(String[] args)` entry point.

**Usage:**
1. **Create ATM Object:**
   Instantiate an `ATM` object and pass it to the `AtmOpereationInterfaceImplementation` constructor.

   ```java
   ATM myATM = new ATM(initialBalance);
   AtmOpereationInterfaceImplementation atmInterface = new AtmOpereationInterfaceImplementation(myATM);
   ```

2. **Perform ATM Operations:**
   Use the implemented methods to simulate ATM operations.

   ```java
   atmInterface.withdrawAmount(1000);
   atmInterface.depositAmount(500);
   atmInterface.viewBalance();
   atmInterface.viewAccountStatement();
   ```

**Learnings:**
- Understanding and implementing interfaces in Java.
- Utilizing collections, in this case, a `HashMap`, to store and retrieve data.
- Handling basic control structures like conditional statements.

**Notes:**
- This project is designed for educational purposes, focusing on fundamental Java concepts.
- Additional features and improvements can be explored, such as input validation, security measures, and more sophisticated account management.
