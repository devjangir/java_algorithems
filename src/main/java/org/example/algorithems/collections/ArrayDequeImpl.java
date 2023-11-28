package org.example.algorithems.collections;

import java.util.ArrayDeque;

public class ArrayDequeImpl {
    public static void main(String[] args) {
        ArrayDeque<String> arrayDeque = new ArrayDeque<>();
        arrayDeque.addFirst("A");
        arrayDeque.addFirst("B");
        arrayDeque.addFirst("C");
        arrayDeque.offerFirst("D");
        arrayDeque.addLast("E");
        arrayDeque.addLast("F");
        System.out.println(arrayDeque.size());
        System.out.println(arrayDeque.getFirst());
        System.out.println(arrayDeque.getLast());
        System.out.println(arrayDeque.contains("A"));
        System.out.println(arrayDeque);
        System.out.println(arrayDeque.peekFirst());
        System.out.println(arrayDeque.peekLast());
        System.out.println(arrayDeque.pollFirst());
        System.out.println(arrayDeque.pollLast());
        System.out.println(arrayDeque.pop());
        System.out.println(arrayDeque.removeFirst());
        System.out.println(arrayDeque.removeLast());

        System.out.println(arrayDeque);
    }
}
