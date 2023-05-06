package com.niit.mymap;

import java.util.Comparator;
import java.util.TreeMap;

public class TreeMapDemo1 {
    public static void main(String[] args) {
        TreeMap<Integer, String> tm = new TreeMap<>((o1, o2) -> o2 - o1);
        tm.put(1001, "meiguihua");
        tm.put(1002, "molihua");
        tm.put(1003, "xiangrikui");
        tm.put(1004, "mantianxing");
        System.out.println(tm);

    }
}
