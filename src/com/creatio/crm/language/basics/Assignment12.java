package com.creatio.crm.language.basics;

public class Assignment12 {

	public static void main(String[] args) {
    int n = 5; // Maximum number of rows for the upper half of the diamond

    // Print the upper half of the diamond
    for (int i = 1; i <= n; i++) {
        // Print spaces for alignment
        for (int j = n; j > i; j--) {
            System.out.print(" ");
        }
        // Print numbers
        for (int j = 1; j <= i; j++) {
            System.out.print(j + " ");
        }
        System.out.println(); // Move to the next line
    }

    // Print the lower half of the diamond
    for (int i = n - 1; i >= 1; i--) {
        // Print spaces for alignment
        for (int j = n; j > i; j--) {
            System.out.print(" ");
        }
        // Print numbers
        for (int j = 1; j <= i; j++) {
            System.out.print(j + " ");
        }
        System.out.println(); // Move to the next line
    }
}
}