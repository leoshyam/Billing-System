
# Billing System Console Application

This Java project implements a simple billing system in a console-based application. Users can add items to a shopping cart, generate a bill, and exit the program.

## Features

- Add items to the cart with details such as name, price, and quantity.
- Generate a bill that displays each item's details and the total amount.
- Exit the application when done.

## How to Use

1. **Compile the Program:**
   - Ensure you have Java Development Kit (JDK) installed on your system.
   - Open a command prompt or terminal.
   - Navigate to the directory containing the `Main.java` file.
   - Compile the program using the command:
     ```
     javac Main.java
     ```

2. **Run the Program:**
   - After compiling successfully, run the program using:
     ```
     java Main
     ```
   
3. **Interacting with the Program:**
   - Follow the prompts in the console:
     - Choose option 1 to add an item to the cart. Enter the item's name, price, and quantity.
     - Choose option 2 to generate a bill. The bill will display each item's details and the total amount.
     - Choose option 3 to exit the program.

## Example Usage

```
1. Add Item to Cart
2. Generate Bill
3. Exit
Enter your choice: 1
Enter item name: Laptop
Enter item price: 1200.50
Enter item quantity: 1

1. Add Item to Cart
2. Generate Bill
3. Exit
Enter your choice: 1
Enter item name: Mouse
Enter item price: 25.75
Enter item quantity: 2

1. Add Item to Cart
2. Generate Bill
3. Exit
Enter your choice: 2

========== Your Bill ==========
Laptop - 1200.50 x 1 = 1200.50
Mouse - 25.75 x 2 = 51.50
===============================
Total: 1252.00
===============================

1. Add Item to Cart
2. Generate Bill
3. Exit
Enter your choice: 3
Exiting...
```

## Notes

- This project serves as a basic example of using Java classes, ArrayLists, and user input/output in a console application.
- Error handling and data validation (e.g., checking for valid input types) are not extensively implemented for simplicity.
