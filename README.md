# Restaurant Order Management System

This Java program simulates a simple order management system for a restaurant. It allows users to place orders at different tables from a predefined menu. The system is divided into three classes:

## 1. Main

- The `Main` class serves as the entry point of the program.
- It initializes a menu, creates tables, and prompts users to enter a table number to place an order.
- Users can choose items from the menu, and the program calculates and prints the total amount for each order.

## 2. Menu

- The `Menu` class represents the restaurant menu.
- It contains a list of predefined items, each with a name and price.
- Users can view the menu, check if an item exists, and get details of an item.

## 3. MenuItem

- The `MenuItem` class defines the structure of a menu item with attributes such as name and price.

## 4. Table

- The `Table` class represents a table in the restaurant.
- Each table has a unique number and a list of orders.
- Users can place orders for a table, and the program calculates and prints the total amount for each order.

## Usage

1. Run the `Main` class to start the program.
2. Enter a table number when prompted.
3. Choose items from the displayed menu to place an order.
4. Enter "q" to finish placing orders for a table.
5. The program prints the list of orders and the total amount for each table.


