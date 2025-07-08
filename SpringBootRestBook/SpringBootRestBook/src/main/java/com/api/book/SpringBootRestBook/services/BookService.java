package com.api.book.SpringBootRestBook.services;

import com.api.book.SpringBootRestBook.entities.Book;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class BookService {

    private static List<Book> list = new ArrayList<>();
    static {
        list.add(new Book(11,"php","abc"));
        list.add(new Book(13,"JAVA","LKL"));
        list.add(new Book(15,"C","XYS"));
    }

    //get all books
    public List<Book> getAllBooks(){
        return list;
    }
    //get single book by id
    public Book getBookById(int id){

        Book book = null;
        book=list.stream().filter(e->e.getId()==id).findFirst().get();
        return book;
    }

    //adding book
    public Book addBook(Book b){
        list.add(b);
        return b;
    }
    //delete book
    public void deleteBook(int bid){
        list.stream().filter(book -> {
            if(book.getId()!==bid){
                return true;
            }
        }).collect(Collectors.toList());
    }

}
