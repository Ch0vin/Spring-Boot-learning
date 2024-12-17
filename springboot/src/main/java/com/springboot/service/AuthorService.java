package com.springboot.service;
import java.util.Optional;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.entities.Author;
import com.springboot.entities.User;
import com.springboot.repositories.AuthorRepository;

@Service
public class AuthorService {
    @Autowired
    private AuthorRepository authorRepository;

    public Author saveAuthor(Author author) {
        return authorRepository.save(author);
    }

    public List<Author> findAllAuthors() {
        return authorRepository.findAll();
    }
}
