package com.homework7;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

import static com.homework7.LibraryData.acceptBook;
import static com.homework7.LibraryData.giveBook;

public class LibraryReader {
    private String readerName;
    private Map<LocalDate, String> myBooks = new HashMap<>();

    public LibraryReader(String readerName) {
        this.readerName = readerName;
    }

    public void getBook(LocalDate date, String nameBook) {
        if (giveBook(date, nameBook)) {
            myBooks.put(date, nameBook);
        } else {
            System.out.println("Book is not available today");
        }
    }

    public void returnBook(LocalDate date, String nameBook) {
        if (acceptBook(date, nameBook)) {
            myBooks.remove(date, nameBook);
        } else {
            System.out.println("Your book is not accept");
        }
    }

    public void printAllMyBooks() {
        if (myBooks.isEmpty()) {
            System.out.println(readerName + " hasn't books");
        } else {
            for (Map.Entry<LocalDate, String> entries : myBooks.entrySet()) {
                System.out.println(readerName + " - " + "Date: " + entries.getKey() + " Book: " + entries.getValue());
            }
        }
    }

    public void printBookOnDate(LocalDate date) {
        if (myBooks.get(date) == null) {
            System.out.println("On this date " + date + " I haven't book");
        } else {
            System.out.println("On this date " + date + " I have - " + myBooks.get(date));
        }
    }
}
