package org.java.project.api.controller;

import org.java.project.pojo.WordAnalysis;

public class WordUtils {
	public static WordAnalysis analyzeWord(String word) {
        word = word.toLowerCase();
        
        // Verifica se la parola è palindroma
        boolean isPalindrome = isPalindrome(word);

        return new WordAnalysis(word, isPalindrome);
    }
	
	private static boolean isPalindrome(String word) {

        String reversed = new StringBuilder(word).reverse().toString();
        return word.equals(reversed);
    }
}
