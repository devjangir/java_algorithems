package org.example.algorithems.collections;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class SyncList {
    public static void main(String[] args) {
        List<Integer> list = new CopyOnWriteArrayList<Integer>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);

        Iterator<Integer> itr = list.iterator();
        list.add(50);
        while(itr.hasNext()) {
            System.out.println(itr.next());
        }

        itr = list.iterator();
        while(itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
}
