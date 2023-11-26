package org.example.algorithems.interfaces;

public class DefaultMethod implements Employee, FunctionalInterface {
    public void doSomething() {
        System.out.println("doSomething() in DefaultMethod");
    }

    public void doSomeFunction() {
        System.out.println("doSomeFunction() in DefaultMethod");
    }

    public static void main(String[] args) {
        DefaultMethod obj = new DefaultMethod();
        obj.doSomething();
        obj.doSomeFunction();
        Employee.doStaticMethod();
    }
}
