package com.epam.training.library.domain;

public class Article {

	public String author;
	public int yearofPublication;
	public String language;

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public int getYearofPublication() {
		return yearofPublication;
	}

	public void setYearofPublication(int yearofPublication) {
		this.yearofPublication = yearofPublication;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

}
