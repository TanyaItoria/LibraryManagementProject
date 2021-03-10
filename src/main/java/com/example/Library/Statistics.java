package com.example.Library;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.*;

@Component
public class Statistics {
    @Autowired
    StatisticsDb statisticsDb;


    public void assignBook(int studentId, int bookId, int quantity) {
        if (statisticsDb.ifExist(studentId)) {
            ArrayList<ArrayList<Integer>> record = statisticsDb.getRecord(studentId);
            for (int i = 0; i < record.size(); i++) {
                if (record.get(i).get(0) == bookId) {
                    quantity+=record.get(i).get(1);
                    record.remove(i);
                    record.add(new ArrayList<Integer>(Arrays.asList(bookId,quantity)));
                    statisticsDb.updateDb(studentId, record);
                    statisticsDb.printDb();
                    return;
                }
            }
            ArrayList<Integer> newBookData = new ArrayList<>();
            newBookData.add(bookId);
            newBookData.add(quantity);
            record.add(newBookData);
            statisticsDb.updateDb(studentId, record);

        } else {
            ArrayList<Integer> newBookData = new ArrayList<>();
            newBookData.add(bookId);
            newBookData.add(quantity);
            ArrayList<ArrayList<Integer>> record = new ArrayList<>();
            record.add(newBookData);
            statisticsDb.updateDb(studentId, record);
        }
        statisticsDb.printDb();
    }

    public boolean withdrawBook(int studentId, int bookId, int quantity) {
            ArrayList<ArrayList<Integer>> record = statisticsDb.getRecord(studentId);
            for (int i = 0; i < record.size(); i++) {
                if (record.get(i).get(0) == bookId) {
                    if (record.get(i).get(1) > quantity) {
                        quantity=record.get(i).get(1)-quantity;
                        record.remove(i);
                        record.add(new ArrayList<Integer>(Arrays.asList(bookId,quantity)));

                    } else if (record.get(i).get(1) == quantity) {
                        record.remove(i);
                    } else {
                        System.out.println("You entered wrong quantity of books to return. Try again with correct quantity.");
                        return false;
                    }
                    statisticsDb.updateDb(studentId, record);
                    return true;

                }
            }
                System.out.println("No book is issued with this book id for this student");
                return false;

    }
}
