package com.niit.myset;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetDemo1 {
    public static void main(String[] args) {
        //创建一个set对象
        //set系列的集合中，元素是唯一的，不允许重复
        Set<String> set = new HashSet<>();

        //添加元素
        //如果集合中一斤存在的元素再次添加，会添加失败并返回布尔值false
        boolean res1 = set.add("norman");
        boolean res2 = set.add("norman");
        boolean res3 = set.add("qianqian");
        System.out.println(res2);
        System.out.println(set);
        System.out.println("---------------------------------------");
        //遍历set集合
        //1、迭代器遍历
        Iterator<String> iterator = set.iterator();
        while(iterator.hasNext()){
            String s = iterator.next();
            System.out.println(s);
        }
        System.out.println("---------------------------------------");
        //2、增强for遍历
        for (String s : set) {
            System.out.println(s);
        }
        System.out.println("---------------------------------------");
        //3、lambda表达式遍历
        set.forEach(s -> System.out.println(s));
    }
}
