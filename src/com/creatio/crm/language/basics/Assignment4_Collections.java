package com.creatio.crm.language.basics;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Assignment4_Collections {

	public static void main(String[] args) {
		// Create a List of Maps to store all test cases
        List<Map<String, Map<String, String>>> testCases = new ArrayList<>();

        // Test Case 1: Student Details
        Map<String, Map<String, String>> studentDetails = new HashMap<>();
        Map<String, String> studentData1 = new HashMap<>();
        studentData1.put("Name", "John Doe");
        studentData1.put("Age", "20");
        studentData1.put("Gender", "Male");
        studentData1.put("Roll Number", "S12345");
        studentData1.put("Grade", "A");
        studentData1.put("Major", "Computer Science");
        studentData1.put("GPA", "3.8");
        studentData1.put("Email", "john@example.com");
        studentData1.put("Contact Number", "9999997777");
        studentData1.put("Address", "123 Elm St");

        Map<String, String> studentData2 = new HashMap<>();
        studentData2.put("Name", "Jane Smith");
        studentData2.put("Age", "21");
        studentData2.put("Gender", "Female");
        studentData2.put("Roll Number", "S12346");
        studentData2.put("Grade", "B");
        studentData2.put("Major", "Mathematics");
        studentData2.put("GPA", "3.5");
        studentData2.put("Email", "jane@example.com");
        studentData2.put("Contact Number", "9876665666");
        studentData2.put("Address", "456 Oak St");

        Map<String, String> studentData3 = new HashMap<>();
        studentData3.put("Name", "Mike Brown");
        studentData3.put("Age", "22");
        studentData3.put("Gender", "Male");
        studentData3.put("Roll Number", "S12347");
        studentData3.put("Grade", "A");
        studentData3.put("Major", "Physics");
        studentData3.put("GPA", "3.9");
        studentData3.put("Email", "mike@example.com");
        studentData3.put("Contact Number", "8787876546");
        studentData3.put("Address", "789 Pine St");

        studentDetails.put("Student1", studentData1);
        studentDetails.put("Student2", studentData2);
        studentDetails.put("Student3", studentData3);
        testCases.add(studentDetails);

        // Test Case 2: Employee Details
        Map<String, Map<String, String>> employeeDetails = new HashMap<>();
        Map<String, String> employeeData1 = new HashMap<>();
        employeeData1.put("Employee ID", "E001");
        employeeData1.put("Name", "Alice Green");
        employeeData1.put("Age", "30");
        employeeData1.put("Gender", "Female");
        employeeData1.put("Department", "Engineering");
        employeeData1.put("Position", "Software Engineer");
        employeeData1.put("Salary", "$75,000");
        employeeData1.put("Email", "alice@example.com");
        employeeData1.put("Contact Number", "9876543213");

        Map<String, String> employeeData2 = new HashMap<>();
        employeeData2.put("Employee ID", "E002");
        employeeData2.put("Name", "Bob Johnson");
        employeeData2.put("Age", "35");
        employeeData2.put("Gender", "Male");
        employeeData2.put("Department", "Marketing");
        employeeData2.put("Position", "Marketing Manager");
        employeeData2.put("Salary", "$85,000");
        employeeData2.put("Email", "bob@example.com");
        employeeData2.put("Contact Number", "9876543214");

        Map<String, String> employeeData3 = new HashMap<>();
        employeeData3.put("Employee ID", "E003");
        employeeData3.put("Name", "Carol White");
        employeeData3.put("Age", "28");
        employeeData3.put("Gender", "Female");
        employeeData3.put("Department", "Sales");
        employeeData3.put("Position", "Sales Executive");
        employeeData3.put("Salary", "$65,000");
        employeeData3.put("Email", "carol@example.com");
        employeeData3.put("Contact Number", "9876543215");

        employeeDetails.put("Employee1", employeeData1);
        employeeDetails.put("Employee2", employeeData2);
        employeeDetails.put("Employee3", employeeData3);
        testCases.add(employeeDetails);

        // Test Case 3: Product Details
        Map<String, Map<String, String>> productDetails = new HashMap<>();
        Map<String, String> productData1 = new HashMap<>();
        productData1.put("Product ID", "P001");
        productData1.put("Name", "Laptop");
        productData1.put("Category", "Electronics");
        productData1.put("Price", "$1,200");
        productData1.put("Stock Quantity", "50");
        productData1.put("Supplier", "Tech Supplies");
        productData1.put("Warranty", "2 years");
        productData1.put("Rating", "4.5");
        productData1.put("Manufacturing Date", "15-01-2023");
        productData1.put("Expiry Date", "15-01-2025");

        Map<String, String> productData2 = new HashMap<>();
        productData2.put("Product ID", "P002");
        productData2.put("Name", "Desk Chair");
        productData2.put("Category", "Furniture");
        productData2.put("Price", "$150");
        productData2.put("Stock Quantity", "200");
        productData2.put("Supplier", "Office Depot");
        productData2.put("Warranty", "1 year");
        productData2.put("Rating", "4");
        productData2.put("Manufacturing Date", "10-02-2023");
        productData2.put("Expiry Date", "N/A");

        Map<String, String> productData3 = new HashMap<>();
        productData3.put("Product ID", "P003");
        productData3.put("Name", "Coffee Maker");
        productData3.put("Category", "Kitchen");
        productData3.put("Price", "$75");
        productData3.put("Stock Quantity", "100");
        productData3.put("Supplier", "KitchenWorld");
        productData3.put("Warranty", "6 months");
        productData3.put("Rating", "4.2");
        productData3.put("Manufacturing Date", "20-03-2023");
        productData3.put("Expiry Date", "20-03-2024");

        productDetails.put("Product1", productData1);
        productDetails.put("Product2", productData2);
        productDetails.put("Product3", productData3);
        testCases.add(productDetails);

        // Access and print data from Product Details > Supplier Name > Office Depot directly
        Map<String, String> product2 = productDetails.get("Product2");
        
     // Output only the Supplier name, "Office Depot"
        System.out.println(product2.get("Supplier"));
	}

}
