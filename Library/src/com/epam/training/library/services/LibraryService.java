package com.epam.training.library.services;

import java.util.ArrayList;
import java.util.List;

import com.epam.training.library.domain.BaseMaterial;

public class LibraryService {

	public List<BaseMaterial> getContentByAuthorr(String author,List<BaseMaterial> books){
		List<BaseMaterial> authorList = new ArrayList<BaseMaterial>();
		for (BaseMaterial book:books ){
			if(book.getAuthor().equalsIgnoreCase(author)){
				authorList.add(book);
			}
		}
		return authorList;
		
	}
}
