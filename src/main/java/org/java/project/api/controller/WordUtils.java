package org.java.project.api.controller;

import org.java.project.pojo.WordAnalysis;

public class WordUtils {
	public static WordAnalysis analyzeWord(String word) {
        word = word.toLowerCase();
        
        // Verifica se la parola è palindroma
        boolean isPalindrome = isPalindrome(word);
        
        // Calcola il numero totale di caratteri
        int totalCharacters = word.length();
        
        // Calcola il numero di vocali e consonanti
        int vowels = countVowels(word);
        int consonants = totalCharacters - vowels;

        return new WordAnalysis(word, isPalindrome, totalCharacters, vowels, consonants);
    }
	
	private static boolean isPalindrome(String word) {

        String reversed = new StringBuilder(word).reverse().toString();
        return word.equals(reversed);
    }
	
	private static int countVowels(String word) {
		
		// Conta il numero di vocali nella stringa 'word'.
		// Si utilizza uno stream di caratteri della stringa,
		// e si filtra mantenendo solo i caratteri che sono presenti nella stringa "aeiou" (le vocali).
		// Infine, si conta il numero di vocali presenti nella stringa.
        return (int) word.chars().filter(c -> "aeiou".indexOf(c) != -1).count();
    }
}
