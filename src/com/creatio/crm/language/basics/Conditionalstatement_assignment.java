package com.creatio.crm.language.basics;
import java.util.ArrayList;
import java.util.List;

public class Conditionalstatement_assignment {

    public static void main(String[] args) {
        // List to store transactions
        List<Integer> transactions = new ArrayList<>();
        
        // Adding the given transactions (Positive: Credit, Negative: Debit)
        transactions.add(50000);
        transactions.add(-2000);
        transactions.add(3000);
        transactions.add(-15000);
        transactions.add(-200);
        transactions.add(-300);
        transactions.add(4000);
        transactions.add(-3000);
        
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

