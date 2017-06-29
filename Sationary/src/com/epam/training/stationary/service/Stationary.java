package com.epam.training.stationary.service;

import java.util.ArrayList;
import java.util.List;

import com.epam.training.stationary.domain.Pen;
import com.epam.training.stationary.domain.Pencil;
import com.epam.training.stationary.domain.StickyPad;
import com.epam.training.stationary.domain.WhilteBoard;
import com.epam.training.stationary.domain.WriteBy;
import com.epam.training.stationary.domain.WriteOn;


public class Stationary {
	
	public List<Object> getStationaryItems(){
		List<Object> kit = new ArrayList<Object>();
		kit.add(new Pen("name",45));
		kit.add(new Pencil("name1",55));
		kit.add(new StickyPad("name1",75));
		kit.add(new WhilteBoard("name1",95));		
		
		return kit;
	}

	public String write(WriteOn surface, WriteBy writableBean){
		return surface.getMessage();
	}
}
