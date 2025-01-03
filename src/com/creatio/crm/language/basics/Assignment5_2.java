package com.creatio.crm.language.basics;

import java.util.HashSet;
import java.util.Set;

public class Assignment5_2 
{

	public static void main(String[] args) 
	{
		Set<String> attractions = new HashSet<>();

        // Add the tourist attractions to the set
        attractions.add("Eiffel Tower, France");
        attractions.add("Great Wall of China, China");
        attractions.add("Colosseum, Italy");
        attractions.add("Statue of Liberty, USA");
        attractions.add("Machu Picchu, Peru");
        attractions.add("Taj Mahal, India");
        attractions.add("Sydney Opera House, Australia");
        attractions.add("Niagara Falls, Canada/USA");
        attractions.add("Pyramids of Giza, Egypt");
        attractions.add("Disneyland, USA");

        // Print the size of the set
        System.out.println("Number of top tourist attractions: " + attractions.size());
	}
}


