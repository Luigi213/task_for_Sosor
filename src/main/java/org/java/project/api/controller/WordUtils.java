package org.java.project.api.controller;

import org.java.project.pojo.WordAnalysis;

public class WordUtils {
	public static WordAnalysis analyzeWord(String word) {
        word = word.toLowerCase();
        
        // Verifica se la parola è palindroma
        boolean isPalindrome = isPalindrome(word);
        
        // Calcola il numero totale di caratteri
        int totalCharacters = word.length();

        return new WordAnalysis(word, isPalindrome, totalCharacters);
    }
	
	private static boolean isPalindrome(String word) {

        String reversed = new StringBuilder(word).reverse().toString();
        return word.equals(reversed);
    }
}
