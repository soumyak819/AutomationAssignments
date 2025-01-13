package com.creatio.crm.language.basics;

public class Conditionalstatements_assignment7 {

	public static void main(String[] args) 
	{
		int creditScore = 700;
		int income=50000;
		boolean employmentStatus=true;
		double dti=40;
		System.out.println("Enter the credit score of the applicant:"+creditScore);
		
		if (creditScore > 750) {
			System.out.println("Loan Approved: Credit score is above 750.");
		} else if (creditScore >= 650 && creditScore <= 750) {
			System.out.println("Credit score is between 650 and 750. Additional checks will be performed.");

			System.out.print("Enter the income of the applicant: " + income);
			if (income >= 50000) {
				System.out.println("\nIncome is sufficient. Checking employment status...");

				System.out.print("Is the applicant employed? (yes/no): " + employmentStatus);
				if (employmentStatus == true) {
					System.out.print("\nEnter the debt-to-income ratio (in percentage): " + dti);

					if (dti < 40) {
						System.out.println("\nLoan Approved: Debt-to-income ratio is below 40%.");
					} else {
						System.out.println("\nLoan Denied: Debt-to-income ratio is 40% or greater.");
					}
				} else {
					System.out.println("\nLoan Denied: Applicant is unemployed.");
				}
			} else {
				System.out.println("\nLoan Denied: Income is less than $50,000.");
			}
		} else {
			System.out.println("\nLoan Denied: Credit score is below 650.");
		}
	}

}	
