package com.niit.myset;

import java.util.HashSet;

public class HashSetDemo2 {
    public static void main(String[] args) {
        Student s1 = new Student("norman",22);
        Student s2 = new Student("qianqian",23);
        Student s3 = new Student("meimei",23);
        Student s4 = new Student("norman",22);

        HashSet<Student> hs = new HashSet<>();
        System.out.println(hs.add(s1));
        System.out.println(hs.add(s2));
        System.out.println(hs.add(s3));
        System.out.println(hs.add(s4));

        System.out.println(hs);
    }
}
