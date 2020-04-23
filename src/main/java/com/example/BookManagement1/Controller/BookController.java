package com.example.BookManagement1.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.*;
import org.springframework.web.bind.annotation.*;

import com.example.BookManagement1.Service.BookService;
import com.example.BookManagement1.entity.Book;

@RestController
@EnableAutoConfiguration
@RequestMapping("/api")
public class BookController {
	
	@Autowired
	BookService service;
	
	@GetMapping(value="/getBook/{id}")
	@ResponseBody
	public Book getBookById(@PathVariable int id) {
		return service.getBookById(id);
	}
	
	@PostMapping(value="/addBook")
	@ResponseBody
	public String addBook(@RequestBody Book book) {
		return service.addBookService(book);
	}
	
	@DeleteMapping(value="/deleteBook/{id}")
	@ResponseBody
	public String deleteBookById(@PathVariable int id) {
		return service.deleteBookById(id);
	}
	
	@GetMapping(value="/getAllBook")
	@ResponseBody
	public List<Book> getAllBook() {
		return service.getAllBook();
	}

}
