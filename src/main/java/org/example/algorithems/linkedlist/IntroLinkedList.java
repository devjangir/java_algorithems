package org.example.algorithems.linkedlist;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class IntroLinkedList {
    public static void main(String[] args) {
        List<Integer> linkedList = new LinkedList<Integer>();

        // add single element
        linkedList.add(10);
        linkedList.add(20);

        // add collections
        List<Integer> array = new ArrayList<Integer>();
        array.add(30);
        array.add(40);
        linkedList.addAll(array);

        System.out.println(linkedList);

        // remove element via index
        System.out.println(linkedList.remove(2));

        System.out.println(linkedList.contains(20));
    }
}
