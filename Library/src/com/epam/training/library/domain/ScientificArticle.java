package com.epam.training.library.domain;

public class ScientificArticle extends BaseMaterial {

	public String topic;

	public String getTopic() {
		return topic;
	}

	public void setTopic(String topic) {
		this.topic = topic;
	}

	public String getScientificSphere() {
		return scientificSphere;
	}

	public void setScientificSphere(String scientificSphere) {
		this.scientificSphere = scientificSphere;
	}

	public String scientificSphere;

}
