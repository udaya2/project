package com.epam.training.stationary.domain;

public class Marker extends WriteBy {
	
	public Marker(String name, Double price) {
		super(name, price);
		// TODO Auto-generated constructor stub
	}
	int size;
	String color;
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	

}
