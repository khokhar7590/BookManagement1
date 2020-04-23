package com.example.BookManagement1.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.catalina.startup.Constants;
import org.springframework.stereotype.Service;

import com.example.BookManagement1.Exception.CustomException;
import com.example.BookManagement1.entity.Book;
import com.example.BookManagement1.utils.Util;

@Service
public class BookService {
	
	Map<Integer,Book> bookMap = new HashMap<Integer,Book>();

	public String addBookService(Book book) {
		int bookId = book.getBookId();
		if(bookId==0) {
			while(true) {
				bookId = (int) Math.random();
				if(!bookMap.containsKey(bookId)) break;
			}
			book.setBookId(bookId);
		}else {
			if(bookMap.containsKey(bookId)) 
				return Util.Failure_Response;
		}
		bookMap.put(bookId, book);
		return Util.Success_Response;
	}
	
	public Book getBookById(int id){
		if(!bookMap.containsKey(id)) throw new CustomException("Invalid ID",2009);
		return bookMap.get(id);
	}
	
	public List<Book> getAllBook(){
		return new ArrayList<Book>(bookMap.values());
	}
	
	public String deleteBookById(int id) {
		bookMap.remove(id);
		return Util.Success_Response;
	}
}
