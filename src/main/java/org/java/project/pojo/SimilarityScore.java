package org.java.project.pojo;

public class SimilarityScore {
	
	private String word1;
	
    private String word2;
    
    private double score;

    public SimilarityScore(String word1, String word2, double score) {
        this.word1 = word1;
        this.word2 = word2;
        this.score = score;
    }

	public String getWord1() {
		return word1;
	}

	public void setWord1(String word1) {
		this.word1 = word1;
	}

	public String getWord2() {
		return word2;
	}

	public void setWord2(String word2) {
		this.word2 = word2;
	}

	public double getScore() {
		return score;
	}

	public void setScore(double score) {
		this.score = score;
	}
}
