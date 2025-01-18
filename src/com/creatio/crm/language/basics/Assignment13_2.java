package com.creatio.crm.language.basics;

public class Assignment13_2 {

	public static void main(String[] args) {
        String paragraph = "Java is a popular programming language. Java is used for web "
                + "development, mobile applications, and more.";

//Divide into multiple words
String[] words = paragraph.split(" ");

//Find total number of occurrences and print indexes
String targetWord = "Java";
int count = 0;

System.out.println("Indexes of the word '" + targetWord + "':");
for (int i = 0; i < words.length; i++) {
   // Remove punctuation for comparison
   String cleanWord = words[i].replaceAll("[^a-zA-Z]", "");
   if (cleanWord.equals(targetWord)) {
       count++;
       System.out.println("Found at index: " + i);
   }
}

System.out.println("Total occurrences of the word '" + targetWord + "': " + count);
}
}