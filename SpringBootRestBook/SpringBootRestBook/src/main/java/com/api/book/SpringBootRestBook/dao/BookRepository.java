package com.api.book.SpringBootRestBook.dao;

import com.api.book.SpringBootRestBook.entities.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book,Integer> {
    public Book findById(int id);

}
