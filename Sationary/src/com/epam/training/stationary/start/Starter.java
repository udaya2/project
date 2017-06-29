package com.epam.training.stationary.start;

import java.util.Collections;
import java.util.List;

import com.epam.training.stationary.domain.Pen;
import com.epam.training.stationary.domain.StickyPad;
import com.epam.training.stationary.service.Stationary;
import com.epam.training.stationary.service.Wtriteable;
import com.epam.training.stationary.util.NameComparator;
import com.epam.training.stationary.util.NameaAndPriceComparator;
import com.epam.training.stationary.util.PriceComparator;

public class Starter {

	
	@SuppressWarnings({ "unchecked" })
	public static void main(String[] args){
		Stationary stationaryIntance = new Stationary();
		List stationalryList = stationaryIntance.getStationaryItems();
		// sort by name
		Collections.sort(stationalryList,new NameComparator());
		System.out.println("sort by name : " + stationalryList);
		
		// sort by price
		Collections.sort(stationalryList,new PriceComparator());
		System.out.println("sort by price : " +  stationalryList);
		
		//sort by name and price;
		Collections.sort(stationalryList,new NameaAndPriceComparator());
		System.out.println("sort by name and price : "+ stationalryList);
		
		// reding message from stickyPad
		Wtriteable writerable = new Wtriteable();
		writerable.createMessage(new Pen(),"Message to Communicate");
		System.out.println(writerable.readMessage(new StickyPad()));
	
		
		
		
		
		 
	}
}
