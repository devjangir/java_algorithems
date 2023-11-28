package org.example.algorithems.stack_queue;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

public class FIndBinaryTillN {
    List<String> calculateBinary(int n) {
        ArrayDeque<String> arrayDeque = new ArrayDeque<>();
        arrayDeque.add("1");
        List<String> result = new ArrayList<>();
        for(int i= 1; i <= n; i++) {
            result.add(arrayDeque.pollFirst());
            String s1 = result.get(i-1) + "0";
            String s2 = result.get(i-1) + "1";
            arrayDeque.add(s1);
            arrayDeque.add(s2);
        }
        return result;
    }
    public static void main(String[] args) {
        System.out.println(new FIndBinaryTillN().calculateBinary(10));

    }
}
