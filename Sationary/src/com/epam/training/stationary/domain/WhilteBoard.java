package com.epam.training.stationary.domain;

import java.util.Comparator;

public class WhilteBoard extends WriteOn{
	int size;
	public double price;
	
	public WhilteBoard(String name, double price) {
		super(name,price);
		// TODO Auto-generated constructor stub
	}

	public double getPrise() {
		return price;
	}

	public void setPrise(double price) {
		this.price = price;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}	

}