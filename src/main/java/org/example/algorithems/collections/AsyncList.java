package org.example.algorithems.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class AsyncList {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);

        Iterator<Integer>  itr = list.iterator();

        while(itr.hasNext()) {
            System.out.println(itr.next());
        }
        list.add(50);
    }
}
