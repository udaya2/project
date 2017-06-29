package com.epam.training.library.domain;

public class Cookbook extends BaseMaterial {
	public String numberOfRecipes;

	public String getNumberOfRecipes() {
		return numberOfRecipes;
	}

	public void setNumberOfRecipes(String numberOfRecipes) {
		this.numberOfRecipes = numberOfRecipes;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getIngredients() {
		return ingredients;
	}

	public void setIngredients(String ingredients) {
		this.ingredients = ingredients;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String type;
	public String ingredients;
	public String title;

}
