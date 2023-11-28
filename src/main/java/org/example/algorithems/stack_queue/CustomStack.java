package org.example.algorithems.stack_queue;

import java.util.ArrayList;
import java.util.List;

interface StackInterface {
    void push(int value);
    int pop();
    int peek();
    boolean isEmpty();
    boolean isFull();
}

class StackUsingList implements StackInterface {

    List<Integer> stack = new ArrayList<>();
    int top = -1;

    @Override
    public void push(int value) {
        stack.add(value);
        top++;
    }

    @Override
    public int pop() {
        return stack.get(top--);
    }

    @Override
    public int peek() {
        return stack.get(top);
    }

    @Override
    public boolean isEmpty() {
        return stack.isEmpty();
    }

    @Override
    public boolean isFull() {
        return false;
    }
}
class StackUsingArray implements StackInterface {

    int[] items;
    int top;
    int size;
    StackUsingArray(int size) {
        this.size = size;
        items = new int[size];
        top = -1;
    }
    @Override
    public void push(int value) {
        if(isFull()) {
            System.out.println("Stack is full");
            return;
        }
        items[++top] = value;
    }

    @Override
    public int pop() {
        if(isEmpty()) {
            System.out.println("Stack is empty");
            return -1;
        }
        return items[top--];
    }

    @Override
    public int peek() {
        if(isEmpty()) {
            System.out.println("Stack is empty");
            return -1;
        }
        return items[top];
    }

    @Override
    public boolean isEmpty() {
        return top == -1;
    }

    @Override
    public boolean isFull() {
        return top == size - 1;
    }
}
public class CustomStack {
    public static void main(String[] args) {
        StackInterface stack = new StackUsingList();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        System.out.println(stack.peek());
        System.out.println(stack.pop());
        System.out.println(stack.peek());
        System.out.println(stack.isEmpty());
        System.out.println(stack.isFull());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.isEmpty());
        System.out.println(stack.isFull());
    }
}
