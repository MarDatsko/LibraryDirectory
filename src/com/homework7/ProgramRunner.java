package com.homework7;

import java.time.LocalDate;
import static com.homework7.Library.allGivenBooks;
import static com.homework7.Library.returnCountBooksOnDate;

public class ProgramRunner {
    public void runProgram(){
        LibraryReader ivan = new LibraryReader("Ivan");
        LibraryReader petro = new LibraryReader("Petro");

        Date data1 = new Date(LocalDate.of(2019, 12, 16));
        Date date2 = new Date(LocalDate.of(2019, 12, 16));
        Date date3 = new Date(LocalDate.of(2019, 12, 14));
        Date date4 = new Date(LocalDate.of(2019, 12, 13));
        Date date5 = new Date(LocalDate.of(2019, 12, 12));
        Date date6 = new Date(LocalDate.of(2019, 12, 12));
        Date date7 = new Date(LocalDate.of(2019, 12, 16));
        Date date8 = new Date(LocalDate.of(2019, 12, 16));

        ivan.getBook(data1, "Don Quixote");
        ivan.getBook(date2, "Moby Dick");
        ivan.getBook(date3, "War and Peace");
        ivan.getBook(date4, "Hamlet");

        petro.getBook(date5, "Lolita");
        petro.getBook(date6, "Germany");
        petro.getBook(date7, "Russia");
        petro.getBook(date8, "Ukraine");

        System.out.println('\n' + "Books what took Ivan");
        ivan.printAllMyBooks();

        System.out.println('\n' + "Books what took Petro");
        petro.printAllMyBooks();

        System.out.println('\n' + "This is Ivan book for a specific date ");
        ivan.printBookOnDate(data1);

        System.out.println('\n' + "All books, what given library");
        allGivenBooks();

        System.out.println('\n' + "Ivan return two books");
        ivan.returnBook(date4, "Hamlet");
        ivan.returnBook(date3, "War and Peace");

        System.out.println('\n' + "All books, what given library");
        allGivenBooks();

        System.out.println('\n' + "Number of books what given Library on specific date");
        System.out.println(returnCountBooksOnDate(new Date(LocalDate.of(2019, 12, 16))));
        System.out.println(returnCountBooksOnDate(new Date(LocalDate.of(2019, 12, 10))));
        System.out.println(returnCountBooksOnDate(new Date(LocalDate.of(2019, 12, 14))));
        System.out.println(returnCountBooksOnDate(new Date(LocalDate.of(2019, 12, 12))));
    }
}
