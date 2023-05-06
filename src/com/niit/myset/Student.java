package com.niit.myset;


public class Student implements Comparable<Student>{
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

/*    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return age == student.age && Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }*/

    public String toString() {
        return "Student{name = " + name + ", age = " + age + "}";
    }

    @Override
    public int compareTo(Student o) {
        System.out.println("----------------------------------------");
        System.out.println("this "+this);
        System.out.println("o "+o);
        //指定排序规则
        //只看年龄，按照年龄的升序进行排序
        //this表示当前要添加的元素
        //o表示已经在红黑树中存在的元素
        //返回值：
        //如果返回值小于0， 表示要添加的元素是小的，则添加在红黑树的左边
        //如果返回值大于0， 表示要添加的元素是大的，则添加在红黑树的右边
        //如果返回值等于0， 表示要添加的元组已经存在在红黑树中了，则要舍弃，不进行添加
        int res = this.getAge() - o.getAge();
        return res;

    }
}
