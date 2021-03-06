package com.example.Library;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Scanner;

@Component
public class BookIssuer {
    @Autowired
    BookDatabase bookDb;
    @Autowired
    Statistics statistics;

    public void issueProcess() {
        ArrayList<Book> books = bookDb.getBooks();
        System.out.println("Enter id of book which you want to issue.");
        System.out.println("Enter quantity of books which you want to issue.");
        Scanner sc = new Scanner(System.in);
        int bookId = sc.nextInt();
        int quantity = sc.nextInt();
        for (Book book : books) {
            if (book.getBookId() == bookId) {
                if (book.getNumberOfBooks() >= quantity) {
                    System.out.println("Enter your id");
                    int studentId = sc.nextInt();
                    statistics.assignBook(studentId, bookId,quantity);
                    System.out.println(quantity + " books are issued.");
                    book.decrementBookQuantity(quantity);
                } else {
                    System.out.println("Sorry! " + quantity + " books are not available.");
                }
                return;
            }

        }
        System.out.println("Book with given Id is not found.");
    }
}
