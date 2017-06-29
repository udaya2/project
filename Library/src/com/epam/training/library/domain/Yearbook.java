package com.epam.training.library.domain;

public class Yearbook extends BaseMaterial {

	public int yearOfIssue;
	public String topic;
	public String format;

	public int getYearOfIssue() {
		return yearOfIssue;
	}

	public void setYearOfIssue(int yearOfIssue) {
		this.yearOfIssue = yearOfIssue;
	}

	public String getTopic() {
		return topic;
	}

	public void setTopic(String topic) {
		this.topic = topic;
	}

	public String getFormat() {
		return format;
	}

	public void setFormat(String format) {
		this.format = format;
	}

}
