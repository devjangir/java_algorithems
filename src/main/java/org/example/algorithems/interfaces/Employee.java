package org.example.algorithems.interfaces;

public interface Employee {
    void doSomething();

    // static method
    static void doStaticMethod() {
        System.out.println("Static method in InterfaceA");
    }

    default void doDefaultMethod() {
        System.out.println("Default method in InterfaceA");
    }
}
