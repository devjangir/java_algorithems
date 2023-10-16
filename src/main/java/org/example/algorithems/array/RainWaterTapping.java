package org.example.algorithems.array;

import java.util.Arrays;

public class RainWaterTapping {
    public static int calculateTotalWaterTrapped(int[] input) {
        // calculate left max
        int[] leftMax = input.clone();
        for(int i=1;i<input.length;i++) {
            leftMax[i] = Math.max(leftMax[i-1], input[i]);
        }

        // calculate right max
        int[] rightMax = input.clone();
        for(int i=input.length - 2; i>0;i--) {
            rightMax[i] = Math.max(rightMax[i+1], input[i]);
        }
        System.out.println(Arrays.toString(leftMax));
        System.out.println(Arrays.toString(rightMax));
        int totalWaterTrapped = 0;
        for(int i=1;i<input.length;i++) {
            int waterTrapped = Math.min(leftMax[i], rightMax[i]) - input[i];
            if(waterTrapped < 0) {
                waterTrapped = 0;
            }
            totalWaterTrapped += waterTrapped;
        }
        System.out.println(totalWaterTrapped);
            return totalWaterTrapped;
    }
    public static void main(String[] args) {
        int[] input = {3, 0, 1, 2, 5};
        System.out.println(calculateTotalWaterTrapped(input));
    }
}
