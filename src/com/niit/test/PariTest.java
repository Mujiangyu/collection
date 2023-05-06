package com.niit.test;

import java.time.LocalDate;

public class PariTest {
    public static void main(String[] args) {
        LocalDate[] birthday = {
                LocalDate.of(1906,12,9),
                LocalDate.of(1910,12,10),
                LocalDate.of(1903,12,3),
                LocalDate.of(1910,6,22)
        };
        Pair<LocalDate> mm = ArrayAlg.minmax(birthday);
        System.out.println("min="+mm.getFirst());
        System.out.println("max="+mm.getSecond());
    }
}


class ArrayAlg {
    public static <T extends Comparable> Pair<T> minmax(T[] t) {
        if (t == null || t.length == 0) return null;
        T min = t[0];
        T max = t[0];
        for (int i = 0; i < t.length; i++) {
            if (min.compareTo(t[i]) > 0) min = t[i];
            if (max.compareTo(t[i]) < 0) max = t[i];
        }
        return new Pair<>(min, max);
    }

}