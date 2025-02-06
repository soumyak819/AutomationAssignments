package com.creatio.crm.language.basics;

public class Assignment11 {

	public static void main(String[] args) { int[] values = {12, 34, 11, 36, 87, 98, 93};

    // Initialize first, second, and third to the first element in the array
    int first = values[0];
    int second = values[0];
    int third = values[0];

    // Iterate through the array to find the largest, second largest, and third largest numbers
    for (int num : values) {
        if (num > first) {
            // Shift values down
            third = second;
            second = first;
            first = num;
        } else if (num > second && num < first) {
            // Update second and third
            third = second;
            second = num;
        } else if (num > third && num < second) {
            // Update third
            third = num;
        }
    }

    // Print second and third largest numbers
    System.out.println("Second largest number: " + second);
    System.out.println("Third largest number: " + third);
}
}