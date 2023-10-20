package org.example.algorithems.array;

import java.util.Arrays;

public class Rotate {
    public static void reverse(int[] input, int start, int end) {
        for(int i=start;i<end;i++) {
            int temp = input[i];
            input[i] = input[end];
            input[end] = temp;
            end--;
        }
    }
    public static int[] rotate(int[] input, int k) {
        int rotation = k % input.length;
        reverse(input, 0, input.length - 1);
        reverse(input, 0, rotation - 1);
        reverse(input, rotation, input.length - 1);
        return input;
    }
    public static void main(String[] args) {
        System.out.println(Arrays.toString(rotate(new int[]{1, 2, 3, 4, 5}, 2)));
    }
}
