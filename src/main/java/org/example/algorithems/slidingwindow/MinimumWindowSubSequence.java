package org.example.algorithems.slidingwindow;

public class MinimumWindowSubSequence {
    public static String minimumWindowSubSequence(String s, String t) {
        int leftS = 0;
        int leftIndex = 0;
        int minLength = Integer.MAX_VALUE;
        int start = 0;
        int end = 0;
        for(int i=0;i<s.length();i++) {
            if(s.charAt(i) == t.charAt(leftIndex)) {
                if(leftIndex == 0) {
                    leftS = i;
                }
                leftIndex++;
            }
            if(leftIndex == t.length()) {
                if(i - leftS + 1 < minLength) {
                  start = leftS;
                  end = i;
                  minLength = i - leftS + 1;
                }
                leftS = i;
                leftIndex = 0;
            }
        }
        return s.substring(start, end + 1);
    }
    public static void main(String[] args) {
        System.out.println(minimumWindowSubSequence("eebcdebdde", "bde"));
    }
}
