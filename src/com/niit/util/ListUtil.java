package com.niit.util;

import java.util.ArrayList;

public class ListUtil {

    private ListUtil(){}

    public static<E> void addAll(ArrayList<E> list,E...e){
        for (E e1 : e) {
            list.add(e1);
        }
    }


}
