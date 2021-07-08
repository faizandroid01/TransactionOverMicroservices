package com.faiz.project.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.faiz.project.service.BookAndAuthorService;

@RestController
public class BookAndAuthorController {

	@Autowired
	private BookAndAuthorService bookAndAuthorService;
	
	@GetMapping("/saveAllBooksAndUsers")
	public String saveAllBooksAndUsers() {
		return bookAndAuthorService.saveBookAndAuthorService();
	}
	
}
