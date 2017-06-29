package com.epam.training.stationary.service;

import com.epam.training.stationary.domain.Pen;
import com.epam.training.stationary.domain.StickyPad;

public class Wtriteable {
	String message;
	
	
	
	public void createMessage(Pen pen, String message){
		this.message = message;
	}

	public String readMessage(StickyPad pad){
		pad.setMessage(message);
		return pad.getMessage();
		
	}
}
