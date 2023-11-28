package org.java.project.pojo;

public class WordAnalysis {
	
	private String word;
	
    private boolean isPalindrome;
    
    private int totalCharacters;
    
    private int vowels;
    
    private int consonants;

    public WordAnalysis(String word, boolean isPalindrome, int totalCharacters, int vowels, int consonants) {
        this.word = word;
        this.isPalindrome = isPalindrome;
        this.totalCharacters = totalCharacters;
        this.vowels = vowels;
        this.consonants = consonants;
    }

	public String getWord() {
		return word;
	}

	public void setWord(String word) {
		this.word = word;
	}

	public boolean isPalindrome() {
		return isPalindrome;
	}

	public void setPalindrome(boolean isPalindrome) {
		this.isPalindrome = isPalindrome;
	}

	public int getTotalCharacters() {
		return totalCharacters;
	}

	public void setTotalCharacters(int totalCharacters) {
		this.totalCharacters = totalCharacters;
	}

	public int getVowels() {
		return vowels;
	}

	public void setVowels(int vowels) {
		this.vowels = vowels;
	}

	public int getConsonants() {
		return consonants;
	}

	public void setConsonants(int consonants) {
		this.consonants = consonants;
	}
    
}
