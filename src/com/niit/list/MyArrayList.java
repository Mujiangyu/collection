package com.niit.list;

import java.util.Arrays;

public class MyArrayList<E>{
    Object[] arr = new Object[10];
    int size;

    public boolean add(E e){
        arr[size] = e;
        size++;
        return true;
    }
    public E get(int index){
        return (E)arr[index];
    }
    public String toString(){
        return Arrays.toString(arr);
    }
}
