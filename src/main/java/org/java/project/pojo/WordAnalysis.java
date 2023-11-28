package org.java.project.pojo;

public class WordAnalysis {
	
	private String word;
	
    private boolean isPalindrome;

    public WordAnalysis(String word, boolean isPalindrome) {
        this.word = word;
        this.isPalindrome = isPalindrome;

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
    
}
