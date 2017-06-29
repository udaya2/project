package com.epam.training.stationary.domain;

public class WriteBy extends BaseStationary {
	
	public String color;
	public WriteBy(String name, Double price){
		super(name,price);
	}
	public WriteBy(){
		
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	

	
	
}
