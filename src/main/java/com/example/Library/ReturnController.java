package com.example.Library;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Scanner;

@Component
public class ReturnController {
    @Autowired
    BookDatabase bookDb;
    @Autowired
    Statistics statistics;
    @Autowired
    StatisticsDb statisticsDb;

    public void returnProcedure() {
        ArrayList<Book> books = bookDb.getBooks();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter student id");
        int studentId = sc.nextInt();
        if (statisticsDb.ifExist(studentId)) {
            System.out.println("Enter id of book which you want to return.");
            int bookId = sc.nextInt();
            System.out.println("Enter quantity of books which you want to return.");
            int quantity = sc.nextInt();
            if (statistics.withdrawBook(studentId, bookId, quantity)) {
                for (Book book : books) {
                    if (book.getBookId() == bookId) {
                        book.incrementBookQuantity(quantity);
                    }
                    }
                System.out.println("Book successfully returned");
                statisticsDb.printDb();

            }
        } else {
            System.out.println("You entered wrong student Id");
        }


    }
}
