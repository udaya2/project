package com.epam.training.library.domain;

public class ScienceMagazine extends BaseMaterial {

	public String issueNumber;
	public String numberOfPages;
	public String topic;
	public String publishingHouse;

	public String getIssueNumber() {
		return issueNumber;
	}

	public void setIssueNumber(String issueNumber) {
		this.issueNumber = issueNumber;
	}

	public String getNumberOfPages() {
		return numberOfPages;
	}

	public void setNumberOfPages(String numberOfPages) {
		this.numberOfPages = numberOfPages;
	}

	public String getTopic() {
		return topic;
	}

	public void setTopic(String topic) {
		this.topic = topic;
	}

	public String getPublishingHouse() {
		return publishingHouse;
	}

	public void setPublishingHouse(String publishingHouse) {
		this.publishingHouse = publishingHouse;
	}

}
