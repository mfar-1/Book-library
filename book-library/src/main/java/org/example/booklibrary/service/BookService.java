package org.example.booklibrary.service;

import org.example.booklibrary.dto.CreateBookDto;
import org.example.booklibrary.entity.Book;
import java.util.List;

public interface BookService {
    Book create(CreateBookDto dto);
    List<Book> findAll();
    Book findById(Integer id);
    Book update(Integer id, CreateBookDto dto);
    void delete(Integer id);
}