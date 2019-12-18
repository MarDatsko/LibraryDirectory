package com.homework7;

import java.time.LocalDate;

import static com.homework7.LibraryData.allGivenBooks;

public class Main {

    public static void main(String[] args) {
        LibraryReader ivan = new LibraryReader("Ivan");
        LibraryReader petro = new LibraryReader("Petro");

        ivan.getBook(LocalDate.of(2019, 12, 16), "Don Quixote");
        ivan.getBook(LocalDate.of(2019, 12, 15), "Moby Dick");
        ivan.getBook(LocalDate.of(2019, 12, 14), "War and Peace");
        ivan.getBook(LocalDate.of(2019, 12, 13), "Hamlet");

        petro.getBook(LocalDate.of(2019, 12, 12), "Lolita");

        System.out.println('\n' + "These are Ivan's books");
        ivan.printAllMyBooks();

        System.out.println('\n' + "These are Petro's books");
        petro.printAllMyBooks();

        System.out.println('\n' + "This is Ivan book for a specific date ");
        ivan.printBookOnDate(LocalDate.of(2019, 12, 18));

        System.out.println('\n' + "All books, what given library");
        allGivenBooks();

        System.out.println('\n' + "Ivan return two books");
        ivan.returnBook(LocalDate.of(2019, 12, 13), "Hamlet");
        ivan.returnBook(LocalDate.of(2019, 12, 14), "War and Peace");

        System.out.println('\n' + "All books, what given library");
        allGivenBooks();
    }
}
