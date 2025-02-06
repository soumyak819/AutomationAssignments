package com.creatio.crm.language.basics;
import java.util.ArrayList;
import java.util.List;

public class Conditionalstatement_assignment_6 {

    public static void main(String[] args) {
    	// Store transactions in an array
    			int[] transactions = { 50000, -2000, 3000, -15000, -200, -300, 4000, -3000 };
        
        // Initialize counters and variables
        int totalCredits = 0;
        int totalDebits = 0;
        int totalAmountCredited = 0;
        int totalAmountDebited = 0;
        int currentBalance = 0;
        int suspiciousTransactions = 0;
        
        // Loop through the transactions
        for (int transaction : transactions) {
            if (transaction > 0) {
                // Credit transaction
                totalCredits++;
                totalAmountCredited += transaction;
                currentBalance += transaction;
                
                // Check if the credit transaction is suspicious
                if (transaction > 10000) {
                    System.out.println("Suspicious credit transaction with Amount: " + transaction);
                    suspiciousTransactions++;
                }
            } else {
                // Debit transaction
                totalDebits++;
                totalAmountDebited += Math.abs(transaction);
                currentBalance += transaction;
                
                // Check if the debit transaction is suspicious
                if (Math.abs(transaction) > 10000) {
                    System.out.println("Suspicious debit transaction with Amount: " + Math.abs(transaction));
                    suspiciousTransactions++;
                }
            }
        }
        
        // Print results
        System.out.println("Total number of credit transactions: " + totalCredits);
        System.out.println("Total number of debit transactions: " + totalDebits);
        System.out.println("Total amount credited: " + totalAmountCredited);
        System.out.println("Total amount debited: " + totalAmountDebited);
        System.out.println("Total amount remaining in the account: " + currentBalance);
        System.out.println("Total number of suspicious transactions: " + suspiciousTransactions);
    }
}

