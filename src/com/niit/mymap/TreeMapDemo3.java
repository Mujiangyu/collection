package com.niit.mymap;

import java.util.ArrayList;
import java.util.TreeMap;

public class TreeMapDemo3 {
    public static void main(String[] args) {
        String str = "aababcabcdabcde";
        ArrayList<Character> list = new ArrayList<>();
        for (int i = 0; i < str.length(); i++) {
            list.add(str.charAt(i));
        }

        TreeMap<Character, Integer> tm = new TreeMap<>();
        for (Character character : list) {
            if (tm.containsKey(character)) {
                int count = tm.get(character);
                count++;
                tm.put(character, count);
            } else {
                tm.put(character, 1);
            }
        }
        System.out.println(tm);
    }
}
