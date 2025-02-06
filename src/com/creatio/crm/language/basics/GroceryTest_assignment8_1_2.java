package com.creatio.crm.language.basics;

import java.util.Scanner;

public class GroceryTest_assignment8_1_2 {

	 public static void main(String[] args) {
		 Grocerylist_assignment8_1_2 groceryList = new Grocerylist_assignment8_1_2();
	        Scanner scanner = new Scanner(System.in);
	        int choice;

	        do {
	            // Display the menu
	            System.out.println("\nGrocery List Manager");
	            System.out.println("1. Add Item");
	            System.out.println("2. Remove Item");
	            System.out.println("3. View List");
	            System.out.println("4. Exit");
	            System.out.print("Enter your choice: ");

	            choice = scanner.nextInt();
	            scanner.nextLine(); // Consume the newline

	            switch (choice) {
	                case 1:
	                    System.out.print("Enter the item to add: ");
	                    String itemToAdd = scanner.nextLine();
	                    groceryList.addItem(itemToAdd);
	                    break;

	                case 2:
	                    System.out.print("Enter the item to remove: ");
	                    String itemToRemove = scanner.nextLine();
	                    groceryList.removeItem(itemToRemove);
	                    break;

	                case 3:
	                    groceryList.viewList();
	                    break;

	                case 4:
	                    System.out.println("Exiting the program. Goodbye!");
	                    break;

	                default:
	                    System.out.println("Invalid choice. Please try again.");
	            }
	        } while (choice != 4);

	        scanner.close();
	    }
	}