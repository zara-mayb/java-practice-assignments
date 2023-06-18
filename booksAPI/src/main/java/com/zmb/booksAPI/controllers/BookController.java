package com.zmb.booksAPI.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.zmb.booksAPI.models.Book;
import com.zmb.booksAPI.services.BookService;

@Controller
public class BookController {

	@Autowired
	BookService bookService;
	
    @GetMapping("/books")
    public String index(Model model) {
        List<Book> books = bookService.allBooks();
        model.addAttribute("books", books);
        return "showAll.jsp";
    }
	
	@GetMapping("books/{bookID}")
	public String index(Model model, @PathVariable("bookID")Long bookId) {
		System.out.println(bookId);
		Book book = bookService.findBook(bookId);
		
		model.addAttribute("book", book);
		return "show.jsp";
	}
}
