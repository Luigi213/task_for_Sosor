package org.java.project.pojo;

public class WordAnalysis {
	
	private String word;
	
    private boolean isPalindrome;
    
    private int totalCharacters;

    public WordAnalysis(String word, boolean isPalindrome, int totalCharacters) {
        this.word = word;
        this.isPalindrome = isPalindrome;
        this.totalCharacters = totalCharacters;
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
    
}
