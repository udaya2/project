package com.epam.training.library.main;

import java.util.List;

import com.epam.training.library.DAO.LibraryDAO;
import com.epam.training.library.domain.BaseMaterial;
import com.epam.training.library.domain.ChildrensBook;
import com.epam.training.library.domain.Newspaper;
import com.epam.training.library.services.LibraryService;

public class Stater {

	public static void main(String[] args) {
		
		//get ebook
		BaseMaterial newsPaper  = new Newspaper();
		newsPaper.getEbook();
		
		//get paperContent
		BaseMaterial childrenBook = new ChildrensBook();
		childrenBook.getPaperContent();
		
		
		// search for author

		LibraryService service = new LibraryService();
		LibraryDAO dao = new LibraryDAO();
		List<BaseMaterial> homeLibrary = dao.getLibraryItems();
		List<BaseMaterial> sameAuthorBooks = service.getContentByAuthorr("RoberCMartin", homeLibrary);
		
		System.out.println(sameAuthorBooks);
		

	}

}
