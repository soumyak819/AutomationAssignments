package com.creatio.crm.language.basics;

import java.util.ArrayList;
import java.util.List;

public class Assignment5_1 {

	public static void main(String[] args) 
	{
		 List<String> countries = new ArrayList<>();

	        // Add the top 5 most populated countries to the list
	        countries.add("India");
	        countries.add("China");
	        countries.add("United States");
	        countries.add("Indonesia");
	        countries.add("Japan");

	        // Print the list of countries
	        System.out.println("Top 5 most populated countries: " + countries);

	        // Print the second country in the list
	        System.out.println("The second most populated country is: " + countries.get(1));
        

	}

}
