package com.creatio.crm.language.basics;

import java.util.ArrayList;

public class Grocerylist_assignment8_1_2 {

	private ArrayList<String> items;

    // Constructor to initialize the list
    public Grocerylist_assignment8_1_2() {
        items = new ArrayList<>();
    }

    // Method to add an item to the list
    public void addItem(String item) {
        items.add(item);
        System.out.println(item + " added to the grocery list.");
    }

    // Method to remove an item from the list
    public void removeItem(String item) {
        if (items.remove(item)) {
            System.out.println(item + " removed from the grocery list.");
        } else {
            System.out.println(item + " not found in the grocery list.");
        }
    }

    // Method to view the current grocery list
    public void viewList() {
        if (items.isEmpty()) {
            System.out.println("The grocery list is empty.");
        } else {
            System.out.println("Grocery List:");
            for (String item : items) {
                System.out.println("- " + item);
            }
        }
    }
}