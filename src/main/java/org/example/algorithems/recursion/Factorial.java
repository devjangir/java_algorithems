package org.example.algorithems.recursion;

public class Factorial {
    private static int factorial(int n) {
        // Base case
        if(n == 1) {
            return 1;
        }
        // call with n-1 as factorial works like 5! = 5 * 4!
        return n * factorial(n -1 );
    }
    public static void main(String[] args) {
        System.out.println(factorial(5));
    }
}