package com.epam.training.library.domain;

public class Almanac extends BaseMaterial {

	public String theme;
	public int numberOfStories;

	public String getTheme() {
		return theme;
	}

	public void setTheme(String theme) {
		this.theme = theme;
	}

	public int getNumberOfStories() {
		return numberOfStories;
	}

	public void setNumberOfStories(int numberOfStories) {
		this.numberOfStories = numberOfStories;
	}

}
