package com.homework7;

import java.time.LocalDate;
import static com.homework7.Library.allGivenBooks;
import static com.homework7.Library.returnCountBooksOnDate;

public class ProgramRunner {
    public void runProgram(){
        LibraryReader ivan = new LibraryReader("Ivan");
        LibraryReader petro = new LibraryReader("Petro");

        Date data12_16_one = new Date(LocalDate.of(2019, 12, 16));
        Date date12_16_two = new Date(LocalDate.of(2019, 12, 16));
        Date date12_14 = new Date(LocalDate.of(2019, 12, 14));
        Date date12_13 = new Date(LocalDate.of(2019, 12, 13));
        Date date12_12_one = new Date(LocalDate.of(2019, 12, 12));
        Date date12_12_two = new Date(LocalDate.of(2019, 12, 12));
        Date date12_16_three = new Date(LocalDate.of(2019, 12, 16));
        Date date12_16_four = new Date(LocalDate.of(2019, 12, 16));

        ivan.getBook(data12_16_one, "Don Quixote");
        ivan.getBook(date12_16_two, "Moby Dick");
        ivan.getBook(date12_14, "War and Peace");
        ivan.getBook(date12_13, "Hamlet");

        petro.getBook(date12_12_one, "Lolita");
        petro.getBook(date12_12_two, "Germany");
        petro.getBook(date12_16_three, "Russia");
        petro.getBook(date12_16_four, "Ukraine");

        System.out.println('\n' + "Books what took Ivan");
        ivan.printAllMyBooks();

        System.out.println('\n' + "Books what took Petro");
        petro.printAllMyBooks();

        System.out.println('\n' + "This is Ivan book for a specific date ");
        ivan.printBookOnDate(data12_16_one);

        System.out.println('\n' + "All books, what given library");
        allGivenBooks();

        System.out.println('\n' + "Ivan return two books");
        ivan.returnBook(date12_13, "Hamlet");
        ivan.returnBook(date12_14, "War and Peace");

        System.out.println('\n' + "All books, what given library");
        allGivenBooks();

        System.out.println('\n' + "Number of books what given Library on specific date");
        System.out.println(returnCountBooksOnDate(new Date(LocalDate.of(2019, 12, 16))));
        System.out.println(returnCountBooksOnDate(new Date(LocalDate.of(2019, 12, 10))));
        System.out.println(returnCountBooksOnDate(new Date(LocalDate.of(2019, 12, 14))));
        System.out.println(returnCountBooksOnDate(new Date(LocalDate.of(2019, 12, 12))));
    }
}
