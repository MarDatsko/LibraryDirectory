package com.homework7;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

public class LibraryData {
    public static Map<LocalDate,String> library = new HashMap<>();

    public static boolean giveBook (LocalDate date, String nameBook){
        library.put(date, nameBook);
        return library.containsKey(date);
    }

    public static boolean acceptBook (LocalDate date, String nameBook){
        library.remove(date,nameBook);
        return !library.containsKey(date);
    }

    public static void allGivenBooks() {
        if (library.isEmpty()) {
            System.out.println("Library didn't give books ");
        } else {
            for (Map.Entry<LocalDate, String> entries : library.entrySet()) {
                System.out.println("Library - "+"Date: " + entries.getKey() + " Book: " + entries.getValue());
            }
        }
    }
}
