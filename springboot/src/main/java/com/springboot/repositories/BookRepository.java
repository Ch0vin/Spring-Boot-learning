package com.springboot.repositories;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.springboot.entities.Book;

@Repository
public interface BookRepository extends JpaRepository<Book, Long> {}