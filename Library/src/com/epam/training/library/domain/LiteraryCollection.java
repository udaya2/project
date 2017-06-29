package com.epam.training.library.domain;

public class LiteraryCollection extends BaseMaterial {
	public String publisher;
	public String topic;

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	public String getTopic() {
		return topic;
	}

	public void setTopic(String topic) {
		this.topic = topic;
	}

	public String getLiteraryType() {
		return literaryType;
	}

	public void setLiteraryType(String literaryType) {
		this.literaryType = literaryType;
	}

	public String literaryType;

}
