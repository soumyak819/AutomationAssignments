package com.creatio.crm.language.basics;

public class Assignment13_1 {

	public static void main(String[] args) {
        String sentence = "Java programming is fun and challenging";

        //Count the total number of words
        String[] words = sentence.split(" ");
        int wordCount = words.length;
        System.out.println("Total number of words: " + wordCount);

        //Print the sentence words in reverse order
        System.out.print("Words in reverse order: ");
        for (int i = words.length - 1; i >= 0; i--) {
            System.out.print(words[i] + " ");
        }
        System.out.println();

        //Convert the first character of each word to uppercase
        StringBuilder capitalizedSentence = new StringBuilder();
        for (String word : words) {
            capitalizedSentence.append(Character.toUpperCase(word.charAt(0)))
                               .append(word.substring(1)).append(" ");
        }
        System.out.println("Sentence with each word capitalized: " + capitalizedSentence.toString().trim());
    }
}