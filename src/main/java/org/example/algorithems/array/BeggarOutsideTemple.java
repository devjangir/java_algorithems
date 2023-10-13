package org.example.algorithems.array;

import java.util.Arrays;
import java.util.List;

public class BeggarOutsideTemple {
    public static void calculateBegging(List<List<Integer>> input) {
        Integer[] defaultBeggars = new Integer[10];
        Arrays.fill(defaultBeggars, 0);
        List<Integer> beggars = Arrays.asList(defaultBeggars);
        for(List<Integer> query: input) {
            Integer start = query.get(0);
            Integer end = query.get(1);
            Integer amount = query.get(2);
            beggars.set(start, beggars.get(start) + amount);
            beggars.set(end, beggars.get(end) - amount);
        }

        // calculate prefix sum array
        for(int i=1;i<beggars.size();i++) {
            beggars.set(i, beggars.get(i) + beggars.get(i-1));
        }

        System.out.println(beggars);
    }
    public static void main(String[] args) {
        List<List<Integer>> input = Arrays.asList(Arrays.asList(1, 5, 10), Arrays.asList(2, 4, 5), Arrays.asList(1, 4, 3));
        calculateBegging(input);
    }
}
