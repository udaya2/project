package com.epam.training.library.domain;

public class ScanWords extends BaseMaterial {
	public String complexity;

	public String getComplexity() {
		return complexity;
	}

	public void setComplexity(String complexity) {
		this.complexity = complexity;
	}

	public int getNumberOfWords() {
		return numberOfWords;
	}

	public void setNumberOfWords(int numberOfWords) {
		this.numberOfWords = numberOfWords;
	}

	public String getPublishingHouse() {
		return publishingHouse;
	}

	public void setPublishingHouse(String publishingHouse) {
		this.publishingHouse = publishingHouse;
	}

	public boolean isQuestionsWithPicture() {
		return questionsWithPicture;
	}

	public void setQuestionsWithPicture(boolean questionsWithPicture) {
		this.questionsWithPicture = questionsWithPicture;
	}

	public int numberOfWords;
	public String publishingHouse;
	public boolean questionsWithPicture;

}
