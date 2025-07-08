package com.api.book.SpringBootRestBook.controllers;

import com.api.book.SpringBootRestBook.entities.Book;
import com.api.book.SpringBootRestBook.services.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class BookController {

    @Autowired
    private BookService bookService;

//    @RequestMapping(value = "/books",method = RequestMethod.GET)
   //get all book handler
    @GetMapping("/books")
    public List<Book> getBooks(){
        return this.bookService.getAllBooks();
    }
    //get single book handler
    @GetMapping("/books/{id}")
    public Book getBook(@PathVariable("id") int id){
        return bookService.getBookById(id);
    }
    //new book handler
    @PostMapping("/books")
    public Book addBook(@RequestBody Book book){
        Book b = this.bookService.addBook(book);
        System.out.println(book);
        return b;
    }
    //delete handler
    @DeleteMapping("/books/{bookId}")
    public Book deleteBook(@PathVariable("bookId") int bookId){
        this.bookService.deleteBook(bookId);
    }

}
