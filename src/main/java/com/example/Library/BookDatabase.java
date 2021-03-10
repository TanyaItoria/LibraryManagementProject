package com.example.Library;

import org.springframework.stereotype.Component;

import java.util.ArrayList;

@Component
public class BookDatabase {

    final private ArrayList<Book> books = new ArrayList<>();

    public ArrayList<Book> getBooks() {
        return books;
    }

    public BookDatabase() {
        books.add(new Book(100, 11, "Book1", "Author1"));
        books.add(new Book(200, 12, "Book2", "Author2"));
        books.add(new Book(300, 13, "Book3", "Author3"));
        books.add(new Book(400, 14, "Book4", "Author4"));

    }
}
