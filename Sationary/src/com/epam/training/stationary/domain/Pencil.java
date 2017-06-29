package com.epam.training.stationary.domain;

public class Pencil extends WriteBy {

	

	int leadSize;

	public Pencil(String name, double price) {
		super(name,price);
		// TODO Auto-generated constructor stub
	}
	
	public int getLeadSize() {
		return leadSize;
	}

	public void setLeadSize(int leadSize) {
		this.leadSize = leadSize;
	}

}
