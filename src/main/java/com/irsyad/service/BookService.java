package com.irsyad.service;

import com.irsyad.model.Book;

import java.util.List;

public interface BookService {

    Book save(Book book);

    List<Book> findAll();

    Book findByTitle(String title);

    Book update(Book book);

    void deleteById(Long id);

}
