package com.technosignia.AutoGenuine.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.technosignia.AutoGenuine.entity.Book;
import com.technosignia.AutoGenuine.service.BookService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@Api(value="Swagger2BookRestContyroller",description = "REST API related to Book Entity!")
@RestController
public class BookController 
{
	@Autowired BookService bookService;
	
	@ApiOperation(value="Create Book In the System",response=Book.class,tags="createBook")
	@ApiResponses(value= {
			@ApiResponse(code=200,message="Success"),
			@ApiResponse(code=201,message="Created"),
			@ApiResponse(code=401,message="Not authorized"),
			@ApiResponse(code=403,message="Forbidden"),
			@ApiResponse(code=404,message="Not Found"),	
	})
	
	@PostMapping("/book")
	public Book createBook(@RequestBody Book book)
	{
		return bookService.createBook(book);
	}
	
	@ApiOperation(value="Get List Of Books in the System",response=Iterable.class,tags="getAllBooks")
	@ApiResponses(value= {
			@ApiResponse(code=200,message="Success"),
			@ApiResponse(code=401,message="Not authorized"),
			@ApiResponse(code=403,message="Forbidden"),
			@ApiResponse(code=404,message="Not Found"),		
	})
	
	@GetMapping("/book")
	public List<Book> getAllBooks()
	{
		return bookService.getAllBooks();
	}
	
	@ApiOperation(value="Get Book by Id in the system",response=Iterable.class,tags="getBookById")
	@ApiResponses(value= {
			@ApiResponse(code=200,message="Success"),
			@ApiResponse(code=401,message="Not authorized"),
			@ApiResponse(code=403,message="Forbidden"),
			@ApiResponse(code=404,message="Not Found"),		
	})
	
	@GetMapping("/book/{id}")
	public Optional<Book> getBookById(@PathVariable long id)
	{
		return bookService.getBookById(id);
	}
	
	@ApiOperation(value="Update the Book in the system",response=Book.class,tags="updateBook")
	@ApiResponses(value= {
			@ApiResponse(code=200,message="Success"),
			@ApiResponse(code=204,message="No Content"),	
			@ApiResponse(code=401,message="Not authorized"),
			@ApiResponse(code=403,message="Forbidden")
				
	})
	
	@PutMapping("/book")
	public Book updateBook(@RequestBody Book book,@RequestParam Long id)
	{
		return bookService.updateBook(book,id);
	}
	
	@ApiOperation(value="Delete the Book in the system",response=Book.class,tags="deleteBook")
	@ApiResponses(value= {
			@ApiResponse(code=200,message="Success"),
			@ApiResponse(code=204,message="No Content"),	
			@ApiResponse(code=401,message="Not authorized"),
			@ApiResponse(code=403,message="Forbidden")
				
	})
	
	@DeleteMapping("/book/{id}")
	public void deleteBook(@PathVariable Long id)
	{
		bookService.deleteBookById(id);
	}

}
