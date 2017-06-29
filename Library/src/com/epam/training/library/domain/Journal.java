package com.epam.training.library.domain;

public class Journal extends BaseMaterial {
	public String periodicity;
	public String subjects;
	public String genre;
	public String format;

	public String getPeriodicity() {
		return periodicity;
	}

	public void setPeriodicity(String periodicity) {
		this.periodicity = periodicity;
	}

	public String getSubjects() {
		return subjects;
	}

	public void setSubjects(String subjects) {
		this.subjects = subjects;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public String getFormat() {
		return format;
	}

	public void setFormat(String format) {
		this.format = format;
	}

}
