package org.example.algorithems.interfaces;

@java.lang.FunctionalInterface
public interface FunctionalInterface {
    void doSomeFunction();
    default void defaultMethodInFunctionalInterface() {
        System.out.println("defaultMethodInFunctionalInterface() in FunctionalInterface");
    }
}
