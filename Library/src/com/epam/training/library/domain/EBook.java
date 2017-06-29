package com.epam.training.library.domain;

public class EBook extends Material {
	int sizeinMb;
	public String title;
	public String author;

	public int getSizeinMb() {
		return sizeinMb;
	}

	public void setSizeinMb(int sizeinMb) {
		this.sizeinMb = sizeinMb;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

}
