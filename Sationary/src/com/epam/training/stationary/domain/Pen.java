package com.epam.training.stationary.domain;

public class Pen extends WriteBy {
	String color;

	public Pen(String name, double price) {
		super(name, price);
		// TODO Auto-generated constructor stub
	}

	public Pen() {

	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

}
