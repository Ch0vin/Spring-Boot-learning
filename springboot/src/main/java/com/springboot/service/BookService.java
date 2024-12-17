package com.springboot.service;
import java.util.Optional;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.springboot.entities.Author;
import com.springboot.entities.Book;
import com.springboot.entities.User;
import com.springboot.repositories.AuthorRepository;
import com.springboot.repositories.BookRepository;

@Service
public class BookService {
    @Autowired
    private BookRepository bookRepository;

    public Book saveBook(Book book) {
        return bookRepository.save(book);
    }

    public List<Book> findAllBooks() {
        return bookRepository.findAll();
    }
}
