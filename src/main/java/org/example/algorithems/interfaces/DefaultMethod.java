package org.example.algorithems.interfaces;

public class DefaultMethod implements Employee {
    public void doSomething() {
        System.out.println("doSomething() in DefaultMethod");
    }
    public static void main(String[] args) {
        DefaultMethod obj = new DefaultMethod();
        obj.doSomething();
        Employee.doStaticMethod();
    }
}
