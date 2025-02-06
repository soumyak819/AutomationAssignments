package com.creatio.crm.language.basics;

import java.util.HashMap;
import java.util.Map;

public class StudentGrades {
    private Map<String, Map<String, Integer>> studentGrades;

    // Constructor to initialize the map
    public StudentGrades() {
        studentGrades = new HashMap<>();
    }

    // Method to add a new student with their grades
    public void addNewStudentGrade(String studentName, String assignment, int grade) {
        studentGrades.putIfAbsent(studentName, new HashMap<>());
        studentGrades.get(studentName).put(assignment, grade);
        System.out.println("Grade added: " + studentName + " - " + assignment + " = " + grade);
    }

    // Method to remove a grade for a student's assignment
    public void removeGrade(String studentName, String assignment) {
        if (studentGrades.containsKey(studentName)) {
            Map<String, Integer> grades = studentGrades.get(studentName);
            if (grades.remove(assignment) != null) {
                System.out.println("Grade removed for " + studentName + " - " + assignment);
            } else {
                System.out.println("Assignment not found for " + studentName);
            }
        } else {
            System.out.println("Student not found.");
        }
    }

    // Method to view grades for a student
    public void viewGrades(String studentName) {
        if (studentGrades.containsKey(studentName)) {
            System.out.println("Grades for " + studentName + ":");
            for (Map.Entry<String, Integer> entry : studentGrades.get(studentName).entrySet()) {
                System.out.println("  " + entry.getKey() + ": " + entry.getValue());
            }
        } else {
            System.out.println("Student not found.");
        }
    }

    // Method to view all students and their grades
    public void viewAllGrades() {
        if (studentGrades.isEmpty()) {
            System.out.println("No students available.");
        } else {
            System.out.println("All Student Grades:");
            for (Map.Entry<String, Map<String, Integer>> entry : studentGrades.entrySet()) {
                System.out.println(entry.getKey() + ":");
                for (Map.Entry<String, Integer> grade : entry.getValue().entrySet()) {
                    System.out.println("  " + grade.getKey() + ": " + grade.getValue());
                }
            }
        }
    }
}