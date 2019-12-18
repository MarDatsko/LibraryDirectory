package com.homework7;

import java.time.LocalDate;
import java.util.Objects;
import java.util.Random;

public class Date {
    private LocalDate date;
    private Integer rand;

    public Date(LocalDate date) {
        this.date = date;
        this.rand = new Random().nextInt(100000000);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Date date1 = (Date) o;
        return Objects.equals(date, date1.date);
    }

    @Override
    public int hashCode() {
        return Objects.hash(date) * rand.hashCode();
    }

    @Override
    public String toString() {
        return date.toString();
    }
}
