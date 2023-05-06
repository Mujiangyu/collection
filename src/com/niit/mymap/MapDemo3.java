package com.niit.mymap;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiConsumer;

public class MapDemo3 {
    public static void main(String[] args) {

        //创建一个map集合的对象
        Map<String, String> map = new HashMap<>();
        //添加元素
        map.put("鲁迅","这句话不是我说的");
        map.put("曹操","不可能，绝对不可能");
        map.put("刘备","我二弟天下无敌");
        map.put("柯镇恶","看我眼色行事");

       /* map.forEach(new BiConsumer<String, String>() {
            @Override
            public void accept(String key, String value) {
                System.out.println(key+"="+value);
            }
        });*/
        map.forEach((key,value) -> System.out.println(key+"="+value));
    }
}
