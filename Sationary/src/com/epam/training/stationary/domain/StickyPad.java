package com.epam.training.stationary.domain;

public class StickyPad extends WriteOn{
	
	String color;
	
	public StickyPad(){
		
	}
	public StickyPad(String name, double price) {
		super(name,price);
		// TODO Auto-generated constructor stub
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	

}
