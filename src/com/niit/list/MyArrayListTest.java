package com.niit.list;

public class MyArrayListTest {
    public static void main(String[] args) {
        MyArrayList<String> list = new MyArrayList<>();
        list.add("norman");
        list.add("qianqian");
        list.add("meimei");

        String s = list.get(1);
        System.out.println(s);

        System.out.println(list);
    }
}
