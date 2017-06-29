package com.epam.training.library.domain;

public class BaseMaterial implements ContentType {

	public String author;
	public int numberOfPages;
	public String title;

	@Override
	public EBook getEbook() {
		EBook ebook = new EBook();
		return ebook;
	}

	@Override
	public PaperContent getPaperContent() {
		PaperContent paper = new PaperContent();
		return paper;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public int getNumberOfPages() {
		return numberOfPages;
	}

	public void setNumberOfPages(int numberOfPages) {
		this.numberOfPages = numberOfPages;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((author == null) ? 0 : author.hashCode());
		result = prime * result + numberOfPages;
		result = prime * result + ((title == null) ? 0 : title.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		BaseMaterial other = (BaseMaterial) obj;
		if (author == null) {
			if (other.author != null)
				return false;
		} else if (!author.equals(other.author))
			return false;
		if (numberOfPages != other.numberOfPages)
			return false;
		if (title == null) {
			if (other.title != null)
				return false;
		} else if (!title.equals(other.title))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "BaseMaterial [author=" + author + ", title=" + title + "]";
	}

}
