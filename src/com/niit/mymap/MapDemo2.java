package com.niit.mymap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapDemo2 {
    public static void main(String[] args) {
        Map<String, String> m = new HashMap<>();

        m.put("norman", "qingshan");
        m.put("qianqian", "meimei");

        Set<Map.Entry<String, String>> entries = m.entrySet();
      /*  for (Map.Entry<String, String> entry : entries) {
            String key = entry.getKey();
            String value = entry.getValue();
            System.out.println(key + "="+value);
        }*/
        /*Iterator<Map.Entry<String, String>> iterator = entries.iterator();
        while (iterator.hasNext()){
            Map.Entry<String, String> res = iterator.next();
            String key = res.getKey();
            String value = res.getValue();
            System.out.println(key + " = " +value);
        }*/
//        entries.forEach((key ,value) -> System.out.println(key + " = " +value));
    }
}
