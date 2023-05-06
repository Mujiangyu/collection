package com.niit.mymap;

import java.util.HashMap;

public class MapDemo1 {
    public static void main(String[] args) {
        var staff = new HashMap<String, Employee>();
        staff.put("1001",new Employee("norman"));
        staff.put("1002",new Employee("qianqian"));
        staff.put("1003",new Employee("meimei"));

        System.out.println(staff);
        staff.remove("1003");
        staff.replace("1001",new Employee("qingshan"));
        System.out.println(staff.get("1002"));
        staff.forEach((k,v)-> System.out.println("key "+k+" value "+v));
    }
}
class Employee{
    private String name;

    public Employee() {
    }

    public Employee(String name) {
        this.name = name;
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

    public String toString() {
        return "Employee{name = " + name + "}";
    }
}