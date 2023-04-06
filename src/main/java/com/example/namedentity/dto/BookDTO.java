package com.example.namedentity.dto;

import com.example.namedentity.entities.Book;

import lombok.Data;

@Data
public class BookDTO {
    private Long id;
    private String title;
    private String authorName;
    private String publisherName;

    public BookDTO(Long id, String title, String authorName, String publisherName) {
        this.id = id;
        this.title = title;
        this.authorName = authorName;
        this.publisherName = publisherName;
    }

    // Getters, setters

    public static BookDTO fromEntity(Book book) {
        return new BookDTO(book.getId(), book.getTitle(), book.getAuthor().getName(), book.getPublisher().getName());
    }
}
