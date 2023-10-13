package org.example.algorithems.array;

import java.util.*;

public class NQQueries {
    public static void unitqueries(Map<Integer, Integer> input) {
        Integer[] arr = new Integer[10];
        Arrays.fill(arr, 0);
        List<Integer> list = Arrays.asList(arr);
        Arrays.fill(list.toArray(), 0);
        for(Map.Entry<Integer, Integer> entry : input.entrySet()) {
            Integer index = entry.getKey();
            Integer value = entry.getValue();
            list.set(index, list.get(index) + value);
        }
        for(int i=1;i<list.size();i++) {
            list.set(i, list.get(i) + list.get(i-1));
        }
        System.out.println(list);
    }
    public static void main(String[] args) {
        Map<Integer, Integer> input = new HashMap<Integer, Integer>();
        input.put(1, 10);
        input.put(4, 5);
        input.put(8, 3);
        unitqueries(input);
    }
}
