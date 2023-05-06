package com.niit.myset;

import java.util.TreeSet;

public class TreeSetDemo2 {
    public static void main(String[] args) {

        //treeset集合的底层不是哈希表
        //而是红黑树的数据结构，所以不需要重写HashCode和equals方法
        Student s1 = new Student("norman",22);
        Student s2 = new Student("qianqian",23);
        Student s3 = new Student("meimei",24);

        TreeSet<Student> ts = new TreeSet<>();
        ts.add(s1);
        ts.add(s2);
        ts.add(s3);

        System.out.println(ts);
    }
}
