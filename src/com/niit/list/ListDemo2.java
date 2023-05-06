package com.niit.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ListDemo2 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        list.add("aaa");
        list.add("bbb");
        list.add("ccc");

        //迭代器
       /* Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()){
            String next = iterator.next();
            System.out.println(next);
        }*/

        //增强for
      /*  for (String s : list) {
            System.out.println(s);
        }*/

        //lambda
/*        list.forEach(s -> System.out.println(s));*/

        //普通for遍历
      /*  for (int i = 0; i < list.size(); i++) {
            String s = list.get(i);
            System.out.println(s);
        }*/

        //列表迭代器
        //在遍历是可以添加元素
        ListIterator<String> listIterator = list.listIterator();
        while (listIterator.hasNext()){
            String res = listIterator.next();
            if(res.equals("aaa")){
                listIterator.add("qianqian");
            }

        }System.out.println(list);
    }

}
