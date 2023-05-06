package com.niit.myset;

public class HashSetDemo1 {
    public static void main(String[] args) {

        //创建对象
        Student s1 = new Student("norman",21);
        Student s2 = new Student("norman",21);

        //如果没有充血hashcode()方法，不同对象计算出的哈希值是不同的
        //重写后，如果对象的属性值相同，那么计算出来的哈希值就相同
        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());

        //

    }
}
