package com.technosignia.AutoGenuine.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.technosignia.AutoGenuine.entity.Book;
import com.technosignia.AutoGenuine.repository.BookRepository;

@Service
public class BookService {

	@Autowired BookRepository bookRepository;
	public Book createBook(Book book) 
	{
		return bookRepository.save(book);
	}
	public List<Book> getAllBooks() 
	{
		return bookRepository.findAll();
	}
	public Optional<Book> getBookById(long id) 
	{
		return bookRepository.findById(id);
	}
	public Book updateBook(Book book, Long id)
	{
		return bookRepository.save(book);
	}
	public void deleteBookById(Long id)
	{
		bookRepository.deleteById(id);
	}

}
