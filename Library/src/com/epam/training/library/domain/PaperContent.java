package com.epam.training.library.domain;

public class PaperContent extends Material {

	public int pageNumbers;
	public String author;

	public int getPageNumbers() {
		return pageNumbers;
	}

	public void setPageNumbers(int pageNumbers) {
		this.pageNumbers = pageNumbers;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

}
