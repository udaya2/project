package com.epam.training.stationary.domain;

import java.util.Comparator;

public class WriteOn extends BaseStationary{
	
	public String message;
	public WriteOn(){
		
	}
	public WriteOn(String name, Double price){
		super(name,price);
	}
	
	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	
	
}
