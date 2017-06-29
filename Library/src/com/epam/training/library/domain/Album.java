package com.epam.training.library.domain;

public class Album extends BaseMaterial {

	public String subject;
	public String painter;
	public int numberOfPictures;

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getPainter() {
		return painter;
	}

	public void setPainter(String painter) {
		this.painter = painter;
	}

	public int getNumberOfPictures() {
		return numberOfPictures;
	}

	public void setNumberOfPictures(int numberOfPictures) {
		this.numberOfPictures = numberOfPictures;
	}

}
