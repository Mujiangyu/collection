package com.niit.myset;

import java.util.LinkedHashSet;

//LinkedHashSet可以保证数据的存取顺序完全一致
public class LinkedHashSetDemo1 {
    public static void main(String[] args) {
        //创建四个学生对象
        Student s1 = new Student("norman", 22);
        Student s2 = new Student("qianqian", 23);
        Student s3 = new Student("meimei", 23);
        Student s4 = new Student("norman", 22);

        LinkedHashSet<Student> linkedHashSet = new LinkedHashSet<>();
        System.out.println(linkedHashSet.add(s1));
        System.out.println(linkedHashSet.add(s2));
        System.out.println(linkedHashSet.add(s3));
        System.out.println(linkedHashSet.add(s4));

        System.out.println(linkedHashSet);

    }
}
