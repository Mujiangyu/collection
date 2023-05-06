package com.niit.myset;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetDemo1 {
    public static void main(String[] args) {

        TreeSet<Integer> ts = new TreeSet<>();

        ts.add(2);
        ts.add(1);
        ts.add(5);
        ts.add(3);
        ts.add(4);

//        System.out.println(ts);

        Iterator<Integer> it = ts.iterator();
        while (it.hasNext()){
            Integer next = it.next();
            System.out.println(next);
        }
        System.out.println("------------------------------");

        for (Integer t : ts) {
            System.out.println(t);
        }
        System.out.println("------------------------------");

        ts.forEach(s -> System.out.println(s));
    }

}
