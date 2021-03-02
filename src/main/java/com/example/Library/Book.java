package com.example.Library;

import org.springframework.stereotype.Component;


public class Book {
    private final int bookId;
    private int numberOfBooks;
    private final String bookName, authorName;

    public void incrementBookQuantity(int number) {
        this.numberOfBooks += number;
    }

    public void decrementBookQuantity(int number) {
        this.numberOfBooks -= number;
    }

    public int getBookId() {
        return bookId;
    }

    public int getNumberOfBooks() {
        return numberOfBooks;
    }


    public Book(int bookId, int numberOfBooks, String bookName, String authorName) {
        this.bookId = bookId;
        this.numberOfBooks = numberOfBooks;
        this.bookName = bookName;
        this.authorName = authorName;
    }
}
