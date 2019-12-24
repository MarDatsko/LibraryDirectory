package com.homework7;

import java.util.HashMap;
import java.util.Map;
import static com.homework7.Library.acceptBook;
import static com.homework7.Library.giveBook;

public class LibraryReader {
    private String readerName;
    private Map<Date, String> myBooks = new HashMap<>();

    public LibraryReader(String readerName) {
        this.readerName = readerName;
    }

    public void getBook(Date date, String bookName) {
        if (giveBook(date, bookName)) {
            myBooks.put(date, bookName);
        } else {
            System.out.println("Book is not available today");
        }
    }

    public void returnBook(Date date, String bookName) {
        if (acceptBook(date, bookName)) {
            myBooks.remove(date, bookName);
        } else {
            System.out.println("Your book is not accept");
        }
    }

    public void printAllMyBooks() {
        if (myBooks.isEmpty()) {
            System.out.println(readerName + " hasn't books");
        } else {
            for (Map.Entry<Date, String> entries : myBooks.entrySet()) {
                System.out.println(readerName + " - " + "Date: " + entries.getKey() + " Book: " + entries.getValue());
            }
        }
    }

    public void printBookOnDate(Date date) {
        if (myBooks.get(date) == null) {                                            // IDEA say what `==` better than `equals`
            System.out.println("On this date " + date + " I haven't book");
        } else {
            System.out.println("On this date " + date + " I have - " + myBooks.get(date));
        }
    }
}
