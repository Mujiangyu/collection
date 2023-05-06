package com.niit.list;

import java.util.ArrayList;
import java.util.List;

public class ListDemo1 {
    public static void main(String[] args) {
        //创建一个list集合
        List<String> list = new ArrayList<>();

        list.add("norman");
        list.add("qianqian");
        list.add("xiaozheng");


        //在指定的索引处添加元素
        //原索引上的元素会依次往后移动个索引
       /* list.add(1,"meimei");*/

        //删除指定索引上的元素
        //会把被删除的元素返回
     /*   String remove = list.remove(0);
        System.out.println(remove);
        */
        //修改指定索引上的元素
        //方法会把被修改的元素返回
      /*  String res = list.set(0, "meimei");
        System.out.println(res);*/

        //返回指定索引处的元素
        String s = list.get(1);
        System.out.println(s);

        System.out.println(list);


    }
}
