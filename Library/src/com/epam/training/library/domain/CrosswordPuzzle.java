package com.epam.training.library.domain;

public class CrosswordPuzzle extends BaseMaterial {
	public int numberOfWordsHorizontally;
	public int numberOfWordsVertically;
	public String questions;
	public String topic;

	public int getNumberOfWordsHorizontally() {
		return numberOfWordsHorizontally;
	}

	public void setNumberOfWordsHorizontally(int numberOfWordsHorizontally) {
		this.numberOfWordsHorizontally = numberOfWordsHorizontally;
	}

	public int getNumberOfWordsVertically() {
		return numberOfWordsVertically;
	}

	public void setNumberOfWordsVertically(int numberOfWordsVertically) {
		this.numberOfWordsVertically = numberOfWordsVertically;
	}

	public String getQuestions() {
		return questions;
	}

	public void setQuestions(String questions) {
		this.questions = questions;
	}

	public String getTopic() {
		return topic;
	}

	public void setTopic(String topic) {
		this.topic = topic;
	}

}
