package com.homework7;

import java.util.HashMap;
import java.util.Map;

public class Library {
    public static Map<Date, String> library = new HashMap<>();

    public static boolean giveBook(Date date, String nameBook) {
        library.put(date, nameBook);
        return library.containsKey(date);
    }

    public static boolean acceptBook(Date date, String nameBook) {
        library.remove(date, nameBook);
        return !library.containsKey(date);
    }

    public static String returnCountBooksOnDate(Date date) {
        int count = 0;
        if (library.isEmpty()) {
            System.out.println("Library didn't give books ");
        } else {
            for (Map.Entry<Date, String> entries : library.entrySet()) {
                if (entries.getKey().equals(date)) {
                    count++;
                }
            }
        }
        return date + " - " + count;
    }

    public static void allGivenBooks() {
        if (library.isEmpty()) {
            System.out.println("Library didn't give books ");
        } else {
            for (Map.Entry<Date, String> entries : library.entrySet()) {
                System.out.println("Library - " + "Date: " + entries.getKey() + " Book: " + entries.getValue());
            }
        }
    }
}
