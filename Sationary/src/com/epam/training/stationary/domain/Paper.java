package com.epam.training.stationary.domain;

public class Paper extends WriteOn{
	public Paper(String name, Double price) {
		super(name, price);
		// TODO Auto-generated constructor stub
	}

	int size;

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}
	

}
