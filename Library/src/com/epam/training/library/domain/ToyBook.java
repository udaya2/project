package com.epam.training.library.domain;

public class ToyBook extends BaseMaterial {

	public String publishingHouse;
	public String bookCover;
	public String composition;

	public String getPublishingHouse() {
		return publishingHouse;
	}

	public void setPublishingHouse(String publishingHouse) {
		this.publishingHouse = publishingHouse;
	}

	public String getBookCover() {
		return bookCover;
	}

	public void setBookCover(String bookCover) {
		this.bookCover = bookCover;
	}

	public String getComposition() {
		return composition;
	}

	public void setComposition(String composition) {
		this.composition = composition;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public int size;

}
