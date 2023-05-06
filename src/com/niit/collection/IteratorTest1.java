package com.niit.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class IteratorTest1 {
    public static void main(String[] args) {
        Collection<String> coll = new ArrayList<>();
        coll.add("aaa");
        coll.add("bbb");
        coll.add("ccc");
        coll.add("ddd");

        //迭代器遍历集合
        Iterator<String> it = coll.iterator();
        while (it.hasNext()){
            //遍历完集合后，next并不会复位到集合的起始位置
            //如果想要再次遍历集合，只能重新创建一个迭代器对象
            String str = it.next();
            System.out.println(str);
        }
    }
}
