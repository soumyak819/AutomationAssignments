package com.creatio.crm.language.basics;

public class Assignment_15_2 {

	public static boolean isPalindrome(String s) {
        // Convert string to lowercase and remove non-alphanumeric characters
        StringBuilder cleanedString = new StringBuilder();
        for (char ch : s.toCharArray()) {
            if (Character.isLetterOrDigit(ch)) {
                cleanedString.append(Character.toLowerCase(ch));
            }
        }

        // Check if the cleaned string is a palindrome
        int left = 0;
        int right = cleanedString.length() - 1;
        while (left < right) {
            if (cleanedString.charAt(left) != cleanedString.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public static void main(String[] args) {
        // Test cases
        String s1 = "A man, a plan, a canal: Panama";
        String s2 = "race a car";

        System.out.println("Input: " + s1);
        System.out.println("Output: " + isPalindrome(s1)); // true

        System.out.println("Input: " + s2);
        System.out.println("Output: " + isPalindrome(s2)); // false
    }
}