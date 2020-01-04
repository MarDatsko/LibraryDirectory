package com.homework7;

import java.time.LocalDate;

import static com.homework7.Library.*;

public class ProgramRunner {
    public void runProgram(){
        LibraryReader ivan = new LibraryReader("Ivan");
        LibraryReader petro = new LibraryReader("Petro");

        Date date12_16FirstBook = new Date(LocalDate.of(2019, 12, 16));
        Date date12_16SecondBook = new Date(LocalDate.of(2019, 12, 16));
        Date date12_14 = new Date(LocalDate.of(2019, 12, 14));
        Date date12_13 = new Date(LocalDate.of(2019, 12, 13));
        Date date12_12FirstBook = new Date(LocalDate.of(2019, 12, 12));
        Date date12_12SecondBook = new Date(LocalDate.of(2019, 12, 12));
        Date date12_16ThirdBook = new Date(LocalDate.of(2019, 12, 16));
        Date date12_16FourthBook = new Date(LocalDate.of(2019, 12, 16));

        ivan.getBook(date12_16FirstBook, "Don Quixote");
        ivan.getBook(date12_16SecondBook, "Moby Dick");
        ivan.getBook(date12_14, "War and Peace");
        ivan.getBook(date12_13, "Hamlet");

        petro.getBook(date12_12FirstBook, "Lolita");
        petro.getBook(date12_12SecondBook, "Germany");
        petro.getBook(date12_16ThirdBook, "Russia");
        petro.getBook(date12_16FourthBook, "Ukraine");

        System.out.println('\n' + "Books what took Ivan");
        ivan.printAllMyBooks();

        System.out.println('\n' + "Books what took Petro");
        petro.printAllMyBooks();

        System.out.println('\n' + "This is Ivan book for a specific date ");
        ivan.printBookOnDate(date12_16FirstBook);

        System.out.println('\n' + "All books, what given library");
        showAllGivenBooks();

        System.out.println('\n' + "Ivan return two books");
        ivan.returnBook(date12_13, "Hamlet");
        ivan.returnBook(date12_14, "War and Peace");

        System.out.println('\n' + "All books, what given library");
        showAllGivenBooks();

        System.out.println('\n' + "Number of books what given Library on specific date");
        System.out.println(getCountBooksOnDate(new Date(LocalDate.of(2019, 12, 16))));
        System.out.println(getCountBooksOnDate(new Date(LocalDate.of(2019, 12, 10))));
        System.out.println(getCountBooksOnDate(new Date(LocalDate.of(2019, 12, 14))));
        System.out.println(getCountBooksOnDate(new Date(LocalDate.of(2019, 12, 12))));
    }
}
