package com.niit.mymap;

import java.util.*;

public class HashMapDemo1 {
    public static void main(String[] args) {

        /*
         * 某班级80名同学，先组织秋游活动，
        * 班长提供了四个景点，（A，B，C，D）
        * 每个学生只能选择一个景点，请统计出最终想去哪个景点的人数最多
        * */
        String[] arr = {"A", "B", "C", "D"};
        Random r = new Random();
        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i < 80; i++) {
            int res = r.nextInt(arr.length);
            list.add(arr[res]);
        }
        HashMap<String, Integer> hm = new HashMap<>();
        for (String name : list) {
            if (hm.containsKey(name)) {
                int count = hm.get(name);
                count++;
                hm.put(name, count);
            } else {
                hm.put(name, 1);
            }
        }
        System.out.println(hm);

        int max = 0;
        //有可能有的景点没有人选择，所以一开始默认哪个景点是最大的都不合适，只能默认为0
        Set<Map.Entry<String, Integer>> entries = hm.entrySet();
        for (Map.Entry<String, Integer> entry : entries) {
            Integer count = entry.getValue();
            if (count > max)
                max = count;

        }
        System.out.println(max);
        for (Map.Entry<String, Integer> entry : entries) {
            Integer count = entry.getValue();
            if (count == max)
                System.out.println(entry.getKey());
        }

    }
}
