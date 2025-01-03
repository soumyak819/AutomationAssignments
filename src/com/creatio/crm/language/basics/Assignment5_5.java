package com.creatio.crm.language.basics;

import java.util.ArrayList;
import java.util.List;

public class Assignment5_5 {

	public static void main(String[] args) 
	{
		// Create a list to store the names of the top 5 highest-grossing movies
        List<String> movies = new ArrayList<>();

        // Add the top 5 highest-grossing movies to the list
        movies.add("Avatar");
        movies.add("Avengers: Endgame");
        movies.add("Avatar: The Way of Water");
        movies.add("Titanic");
        movies.add("Star Wars: The Force Awakens");

        // Print the third movie in the list (index 2)
        System.out.println("The third highest-grossing movie is: " + movies.get(2));

	}

}
