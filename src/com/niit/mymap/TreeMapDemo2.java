package com.niit.mymap;

import java.util.TreeMap;

public class TreeMapDemo2 {
    public static void main(String[] args) {
        TreeMap<Student,String> tm = new TreeMap<>();

        Student s1 = new Student("zhangsna",23);
        Student s2 = new Student("lisi",24);
        Student s3 = new Student("wangwu",25);

        tm.put(s1,"jiangsu");
        tm.put(s2,"anhui");
        tm.put(s3,"tianjing");

        System.out.println(tm);

    }
}
class Student implements Comparable<Student>{
    private String name;
    private int age;

    public Student() {
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    /**
     * 获取
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * 设置
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取
     * @return age
     */
    public int getAge() {
        return age;
    }

    /**
     * 设置
     * @param age
     */
    public void setAge(int age) {
        this.age = age;
    }

    public String toString() {
        return "Student{name = " + name + ", age = " + age + "}";
    }

    @Override
    public int compareTo(Student o) {
        int i =  this.getAge()-o.getAge();
        i = i == 0 ? this.getName().compareTo(o.getName()) : i;
        return i;
    }
}