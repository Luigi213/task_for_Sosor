package org.java.project.api.controller;

import java.util.HashMap;
import java.util.Map;

import org.java.project.pojo.SimilarityScore;
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
        
        // Calcola la frequenza delle lettere nella parola
        Map<Character, Integer> frequencyMap = calculateLetterFrequency(word);


        return new WordAnalysis(word, isPalindrome, totalCharacters, vowels, consonants, frequencyMap);
    }
	
	public static SimilarityScore compareWords(String word1, String word2) {
        word1 = word1.toLowerCase();
        word2 = word2.toLowerCase();

        // Implementa un algoritmo di confronto a tua scelta
        double similarityScore = calculateSimilarityScore(word1, word2);

        // Restituisci un'istanza di SimilarityScore con lo score
        return new SimilarityScore(word1, word2, similarityScore);
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
	
    private static Map<Character, Integer> calculateLetterFrequency(String word) {

        Map<Character, Integer> frequencyMap = new HashMap<>();
        
        // Itera su ciascun carattere della parola.
        for (char c : word.toCharArray()) {
        	// Aggiorna la mappa delle frequenze:
            // - Se il carattere è già presente, incrementa il contatore.
            // - Se il carattere non è presente, inserisce il carattere con un contatore di frequenza iniziale di 1.
            frequencyMap.put(c, frequencyMap.getOrDefault(c, 0) + 1);
        }
        
        return frequencyMap;
    }
    
    private static double calculateSimilarityScore(String word1, String word2) {
        
        int commonLetters = 0;
        
        // Itera su ciascun carattere di word1.
        for (char c : word1.toCharArray()) {
        	// Verifica se il carattere è presente in word2.
            // Se sì, incrementa il contatore delle lettere comuni.
            if (word2.indexOf(c) != -1) {
                commonLetters++;
            }
        }
        
        // Calcola lo score di similarità dividendo il numero di lettere comuni
        // per la lunghezza massima tra le due parole.
        return (double) commonLetters / Math.max(word1.length(), word2.length());
    }

}
