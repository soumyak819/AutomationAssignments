package com.creatio.crm.language.basics;

public class Assignment11 {

	public static void main(String[] args) {
		// Given array of values
        int[] numbers = {12, 34, 11, 36, 87, 98, 93};

        // Initialize variables for the largest, second largest, and third largest
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        int thirdLargest = Integer.MIN_VALUE;

        // Loop through the array to determine the largest, second largest, and third largest
        for (int number : numbers) {
            if (number > largest) {
                thirdLargest = secondLargest;
                secondLargest = largest;
                largest = number;
            } else if (number > secondLargest && number != largest) {
                thirdLargest = secondLargest;
                secondLargest = number;
            } else if (number > thirdLargest && number != secondLargest && number != largest) {
                thirdLargest = number;
            }
        }

        // Output the results
        if (secondLargest != Integer.MIN_VALUE && thirdLargest != Integer.MIN_VALUE) {
            System.out.println("Second Largest: " + secondLargest);
            System.out.println("Third Largest: " + thirdLargest);
        } else {
            System.out.println("Not enough distinct values to determine second and third largest.");
        }
    }
}