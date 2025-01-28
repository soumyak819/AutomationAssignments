package com.creatio.crm.language.basics;

public class Assignment_15_1 {

	public static void main(String[] args) {
        String input = " I Love Dogs ";
        
        // Remove spaces manually
        StringBuilder cleanedInput = new StringBuilder();
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (ch != ' ') { // Skip spaces
                cleanedInput.append(ch);
            }
        }

        System.out.println("2-letter combinations:");

        // Generate all 2-letter combinations
        for (int i = 0; i < cleanedInput.length(); i++) {
            for (int j = 0; j < cleanedInput.length(); j++) {
                if (i != j) { // Ensure letters are not the same
                    System.out.println("" + cleanedInput.charAt(i) + cleanedInput.charAt(j));
                }
            }
        }
    }
}