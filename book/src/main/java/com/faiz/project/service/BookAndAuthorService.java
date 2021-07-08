package com.faiz.project.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.client.RestTemplate;

@Service
public class BookAndAuthorService {

	@Autowired
	BookService bookService;

	@Transactional(propagation = Propagation.REQUIRED)
	public String saveBookAndAuthorService() {

		if(callToAuthorServerToSaveUsers().equalsIgnoreCase("Successfully saved in User Db > User Table. ")) {
			bookService.saveBooks();
		}

		int c = 5/0;
		
		return "Success";
	}

	private String callToAuthorServerToSaveUsers() {

		RestTemplate restTemplate = new RestTemplate();
		String saveUsersUrl = "http://localhost:8081/saveUsers";
		ResponseEntity<String> response = restTemplate.getForEntity(saveUsersUrl , String.class);
		
		System.out.println(response.getStatusCode());
		System.out.println(response.getBody());
		System.out.println(response.getStatusCodeValue());
		
		if (response.getStatusCode().equals(HttpStatus.OK)) {
			return response.getBody();
		}

		return "Failure";
	}

}
