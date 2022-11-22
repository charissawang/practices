package com.charissa.leetcode;

/**
 * 345. Reverse Vowels of a String
 */
public class ReverseVowels {
    public static String reverseVowels(String s) {
        if (s == null || s.length() == 0) {
            return s;
        }

        char[] chs = s.toCharArray();
        int l = 0, r = chs.length -1;
        while (l < r) {
            while (l < chs.length && !isVowels(chs[l])) {
                l++;
            }
            while (r >= 0 && !isVowels(chs[r])) {
                r--;
            }

            if (l < r) {
                char temp = chs[l];
                chs[l] = chs[r];
                chs[r] = temp;
                l++;
                r--;
            }
        }


        return String.valueOf(chs);
    }

    private static boolean isVowels(char ch) {
        char c = Character.toLowerCase(ch);
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }

    public static void main (String... argv) {
        System.out.println("expected results is a.b,.    " + reverseVowels("a.b,."));
        System.out.println("expected results is holle    " + reverseVowels("hello"));
    }
}
