package com.charissa.leetcode;

public class UglyNumber {
    public static boolean isUgly(int n) {
        if ( n == 0 ) {
            return false;
        }

        int[] prims = new int[] { 2, 3, 5 };
        for (int i : prims) {
            while ( n % i == 0) {
                n = n / i;
            }
        }

        return n == 1;
    }

    public static void main (String... argv) {
        System.out.println("expected result is true: " + isUgly(6));
    }
}
