package com.creatio.crm.language.basics;

import java.util.Scanner;

public class StudentTest {
    public static void main(String[] args) {
        StudentGrades studentGrades = new StudentGrades();
        Scanner scanner = new Scanner(System.in);
        int choice;

        // Prepopulate data for 3 students
        studentGrades.addNewStudentGrade("Alice", "Math", 85);
        studentGrades.addNewStudentGrade("Bob", "Science", 90);
        studentGrades.addNewStudentGrade("Charlie", "History", 78);

        do {
            // Display the menu
            System.out.println("\nStudent Grades Manager");
            System.out.println("1. Add Grade for Student");
            System.out.println("2. Remove Grade for Student");
            System.out.println("3. View Grades for a Student");
            System.out.println("4. View All Students' Grades");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            choice = scanner.nextInt();
            scanner.nextLine(); // Consume the newline

            switch (choice) {
                case 1:
                    System.out.print("Enter student name: ");
                    String studentName = scanner.nextLine();
                    System.out.print("Enter assignment name: ");
                    String assignment = scanner.nextLine();
                    System.out.print("Enter grade: ");
                    int grade = scanner.nextInt();
                    studentGrades.addNewStudentGrade(studentName, assignment, grade);
                    break;

                case 2:
                    System.out.print("Enter student name: ");
                    studentName = scanner.nextLine();
                    System.out.print("Enter assignment name: ");
                    assignment = scanner.nextLine();
                    studentGrades.removeGrade(studentName, assignment);
                    break;

                case 3:
                    System.out.print("Enter student name: ");
                    studentName = scanner.nextLine();
                    studentGrades.viewGrades(studentName);
                    break;

                case 4:
                    studentGrades.viewAllGrades();
                    break;

                case 5:
                    System.out.println("Exiting the program. Goodbye!");
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 5);

        scanner.close();
    }
}