package com.faiz.project.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.faiz.project.model.book.Book;
import com.faiz.project.service.BookService;

@RestController
public class BookController {

	@Autowired
	private BookService bookService;

	@GetMapping("/getAllBooks")
	public List<Book> getAllBooks() {
		return (List<Book>) bookService.getAllBooks();
	}

	@GetMapping("/saveBooks")
	public String saveBooks() {
		return bookService.saveBooks();
	}

}
