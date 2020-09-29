package com.irsyad.controller;

import com.irsyad.model.Book;
import com.irsyad.service.BookService;
import io.micronaut.http.annotation.*;

import javax.inject.Inject;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.Optional;

@Controller("/api/v1/book")
@Produces()
public class BookController {

    @Inject
    BookService bookService;

    @Get
    List<Book> findAllBook(){
        return bookService.findAll();
    }

    @Get(value = "/title/{title}")
    Optional<Book> findBookByTitle(@NotNull @PathVariable String title){
        return Optional.ofNullable(bookService.findByTitle(title)).stream().findFirst();
    }

    @Post
    Book addBook(@Body @Valid Book book){
        return bookService.save(book);
    }

}
