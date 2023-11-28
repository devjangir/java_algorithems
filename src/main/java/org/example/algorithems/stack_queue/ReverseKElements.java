package org.example.algorithems.stack_queue;

import java.util.ArrayDeque;
import java.util.Stack;

public class ReverseKElements {

    ArrayDeque<Integer> reverseKElements(ArrayDeque<Integer> queue, int k) {
        Stack<Integer> stack = new Stack<>();
        for(int i=0;i<k;i++) {
            stack.push(queue.removeFirst());
        }
        while(!stack.isEmpty()) {
            queue.addLast(stack.pop());
        }
        int size = queue.size() - k;
        while(size > 0) {
            queue.addLast(queue.removeFirst());
            size--;
        }
        return queue;
    }

    public static void main(String[] args) {
        ArrayDeque<Integer> queue = new ArrayDeque<>();
        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.add(4);
        System.out.println(new ReverseKElements().reverseKElements(queue, 2));
    }
}
