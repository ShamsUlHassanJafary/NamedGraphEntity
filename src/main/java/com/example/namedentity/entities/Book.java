package com.example.namedentity.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.NamedAttributeNode;
import jakarta.persistence.NamedEntityGraph;
import jakarta.persistence.NamedSubgraph;
import lombok.Data;
import jakarta.persistence.*;

@Entity
@Data
@NamedEntityGraph(name = "Book.namedGraph", attributeNodes = {
                @NamedAttributeNode(value = "author"),
                @NamedAttributeNode(value = "publisher")
})
public class Book {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;
        private String title;

        @ManyToOne(fetch = FetchType.LAZY)
        private Author author;

        @ManyToOne(fetch = FetchType.LAZY)
        private Publisher publisher;

        // Getters, setters, constructors, equals, and hashCode
}
