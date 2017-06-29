package com.epam.training.library.domain;

public class MiniatureEditionBook extends BaseMaterial {
	public int size;
	public String topic;

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public String getTopic() {
		return topic;
	}

	public void setTopic(String topic) {
		this.topic = topic;
	}

}
