package org.example.algorithems.slidingwindow;

import java.util.*;

public class RepeatedDNA {
    public static Set<String> repeatedDNASequence(String s, int k) {
        int n = s.length();
        if(n < k) {
            return new HashSet<>();
        }

        Map<Character, Integer> mapping = new HashMap<>();
        mapping.put('A', 1);
        mapping.put('C', 2);
        mapping.put('G', 3);
        mapping.put('T', 4);

        int a = 4;
        List<Integer> nums = new ArrayList<>(Arrays.asList(new Integer[n]));
        Arrays.fill(nums.toArray(), 0);
        for(int i = 0; i < n; i++) {
            nums.set(i, mapping.get(s.charAt(i)));
        }

        int hashValue = 0;
        Set<Integer> seen = new HashSet<>();
        Set<String> output = new HashSet<>();
        for(int i=0;i<n-k+1;i++) {
            if(i == 0) {
                for(int j=0;j<k;j++) {
                    hashValue += nums.get(j) * (int)Math.pow(a, k-j-1);
                }
            } else {
                hashValue = (hashValue - nums.get(i-1) * (int)Math.pow(a, k-1)) * a + nums.get(i+k-1);
            }
            if(seen.contains(hashValue)) {
                output.add(s.substring(i, i+k));
            }
            seen.add(hashValue);
        }
        return output;
    }
    public static void main(String[] args) {
        List<String> queryString = Arrays.asList("ACGT", "AGACCTAGAC", "AAAAACCCCCAAAAACCCCCC",
                "GGGGGGGGGGGGGGGGGGGGGGGGG", "TTTTTCCCCCCCTTTTTTCCCCCCCTTTTTTT", "TTTTTGGGTTTTCCA",
                "AAAAAACCCCCCCAAAAAAAACCCCCCCTG", "ATATATATATATATAT");
        List<Integer> sizes = Arrays.asList(3, 3, 8, 12, 10, 14, 10, 6);
        for(int i=0;i<queryString.size();i++) {
            System.out.println(repeatedDNASequence(queryString.get(i), sizes.get(i)));
        }
    }
}
