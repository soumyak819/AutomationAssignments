package com.creatio.crm.language.basics;

import java.util.HashMap;
import java.util.Map;

public class Assignment5_3 {

	public static void main(String[] args) 
	{
		Map<String, Integer> cities = new HashMap<>();

		// Add the largest cities and their populations to the map
		cities.put("New York", 8258035);
		cities.put("Los Angeles", 3820914);
		cities.put("Chicago", 2664452);
		cities.put("Houston", 2314157);
		cities.put("Phoenix", 1650070);

		// Print the map
		System.out.println("Largest cities in the United States and their populations:");
		for (Map.Entry<String, Integer> entry : cities.entrySet()) 
		{
			System.out.println(entry.getKey() + " - Population: " + entry.getValue());
		}

	}

}
