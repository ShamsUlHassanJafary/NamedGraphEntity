package com.example.namedentity.entities;

import java.util.List;

import jakarta.persistence.Entity;
import lombok.Data;
import jakarta.persistence.*;

@Data
@Entity
public class Author {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;

    @OneToMany(mappedBy = "author")
    private List<Book> books;

    // Getters, setters, constructors, equals, and hashCode
}
