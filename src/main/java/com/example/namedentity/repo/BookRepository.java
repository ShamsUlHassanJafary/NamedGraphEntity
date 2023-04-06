package com.example.namedentity.repo;

import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.namedentity.entities.Book;

import java.util.List;

@Repository
public interface BookRepository extends JpaRepository<Book, Long> {

    // @EntityGraph(value = "Book.namedGraph", type =
    // EntityGraph.EntityGraphType.LOAD)
    List<Book> findAll();
}
