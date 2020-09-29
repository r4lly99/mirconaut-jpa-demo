package com.irsyad.repository;

import com.irsyad.model.Book;
import io.micronaut.context.annotation.Executable;
import io.micronaut.data.annotation.Repository;
import io.micronaut.data.repository.CrudRepository;

import javax.validation.constraints.NotNull;

@Repository
public interface BookRepository extends CrudRepository<Book, Long> {

    @Executable
    Book findByTitle(@NotNull String title);

}
