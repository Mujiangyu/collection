package com.niit.test;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListTest {
    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("norman");
        linkedList.add("qianqian");
        linkedList.add("meimei");

        LinkedList<String> linkedList1 = new LinkedList<>();
        linkedList1.add("I");
        linkedList1.add("Love");
        linkedList1.add("You");
        linkedList1.add("!");

        ListIterator<String> iterator = linkedList.listIterator();
        Iterator<String> iterator1 = linkedList1.iterator();

        while (iterator1.hasNext()){
            if(iterator.hasNext())
                iterator.next();
            iterator.add(iterator1.next());
        }

        System.out.println(linkedList);

        iterator1 = linkedList1.iterator();
        while (iterator1.hasNext()){
            iterator1.next();
            if(iterator1.hasNext()){
                iterator1.next();
                iterator1.remove();
            }
        }
        System.out.println(linkedList1);

        linkedList.removeAll(linkedList1);
        System.out.println(linkedList);

    }

}
