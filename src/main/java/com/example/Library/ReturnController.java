package com.example.Library;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Scanner;

@Component
public class ReturnController {
    @Autowired
    BookDatabase bookDb;

    public void returnProcedure() {
        ArrayList<Book> books = bookDb.getBooks();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter id of book which you want to return.");
        System.out.println("Enter quantity of books which you want to return.");
        int bookId = sc.nextInt();
        int quantity = sc.nextInt();

        for (Book book : books) {
            if (bookId == book.getBookId()) {
                if (quantity <= book.getNumberOfBooks()) {
                    book.incrementBookQuantity(quantity);
                    System.out.println("Book successfully Returned");
                } else {
                    System.out.println("You entered wrong quantity. Try again!");
                }
                return;
            }
        }

        System.out.println("There is no book with the entered id");

    }

}
