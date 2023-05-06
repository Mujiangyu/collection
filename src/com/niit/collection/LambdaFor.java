package com.niit.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.function.Consumer;

public class LambdaFor {
    public static void main(String[] args) {
//        使用lambda表达式表示：
//                default void forEach(COnsumer< ? suoer ? > action)
        //创建集合添加元素
        Collection<String> collection = new ArrayList<>();
        collection.add("norman");
        collection.add("qianqina");
        collection.add("xiaozheng");
        //匿名内部类遍历
        //底层原理
        //自己遍历集合，一次得到每一个元素
        //把得到的每一个元素，传递给下面的accept方法
        //s依次表示集合中的每一个元素
//        collection.forEach(new Consumer<String>() {
//            @Override
//            public void accept(String s) {
//                System.out.println(s);
//            }
//        });
//        lambda表达式遍历
        collection.forEach(s -> System.out.println(s));


    }
}
