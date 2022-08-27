package com.charissa.leetcode;

/**
 * 13.Roman to Integer
 */
public class RomanIntegerConverter {
    public static int romanToInt(String s) {
        char[] chars = s.toCharArray();
        int len = chars.length;
        int total = 0;
        for (int i = 0; i < len; i++) {
            int num = getNumber(chars[i]);
            if (i == len - 1) {
                total +=  num;
            } else if (chars[i] == 'I' && (chars[i + 1] == 'V' || chars[i + 1] == 'X')) {
                total -= num;
            } else if (chars[i] == 'X' &&  (chars[i + 1] == 'L' || chars[i + 1] == 'C')) {
                total -= num;
            } else if (chars[i] == 'C' &&  (chars[i + 1] == 'D' || chars[i + 1] == 'M')) {
                total -= num;
            } else {
                total +=  num;
            }
        }

        return total;
    }

    private static int getNumber(char ch) {
        switch (ch) {
            case 'I':
                return 1;
            case 'V':
                return 5;
            case 'X':
                return 10;
            case 'L':
                return 50;
            case 'C':
                return 100;
            case 'D':
                return 500;
            case 'M':
                return 1000;
            default:
                return 0;
        }
    }

    public static void main (String... argv) {
        System.out.println("III = " + romanToInt("III"));
        System.out.println("LVIII = " + romanToInt("LVIII"));
        System.out.println("MCMXCIV = " + romanToInt("MCMXCIV"));
    }
}
