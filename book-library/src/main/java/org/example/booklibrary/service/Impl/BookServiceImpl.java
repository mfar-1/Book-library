package org.example.booklibrary.service.Impl;

import lombok.RequiredArgsConstructor;
import org.example.booklibrary.dto.CreateBookDto;
import org.example.booklibrary.entity.Book;
import org.example.booklibrary.exception.NotFoundException;
import org.example.booklibrary.repository.BookRepository;
import org.example.booklibrary.service.BookService;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
@RequiredArgsConstructor
public class BookServiceImpl implements BookService {
    private final BookRepository bookRepository;

    @Override
    public Book create(CreateBookDto dto) {
        Book book = new Book();
        book.setTitle(dto.getTitle());
        book.setAuthor(dto.getAuthor());
        book.setPublishedYear(dto.getPublishedYear());
        book.setGenre(dto.getGenre());
        return bookRepository.save(book);
    }

    @Override
    public List<Book> findAll() {
        return bookRepository.findAll();
    }

    @Override
    public Book findById(Integer id) {
        return bookRepository.findById(id).orElseThrow(() -> new NotFoundException("Book with id " + id + " not found"));
    }

    @Override
    public Book update(Integer id, CreateBookDto dto) {
        Book book = findById(id);
        book.setTitle(dto.getTitle());
        book.setAuthor(dto.getAuthor());
        book.setPublishedYear(dto.getPublishedYear());
        book.setGenre(dto.getGenre());
        return bookRepository.save(book);
    }

    @Override
    public void delete(Integer id) {
        bookRepository.deleteById(id);
    }
}