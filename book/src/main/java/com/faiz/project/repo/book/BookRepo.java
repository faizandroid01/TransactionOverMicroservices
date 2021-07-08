package com.faiz.project.repo.book;

import org.springframework.data.repository.CrudRepository;

import com.faiz.project.model.book.Book;

public interface BookRepo extends CrudRepository<Book, Integer>{

}
