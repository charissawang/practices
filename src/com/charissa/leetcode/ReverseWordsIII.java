package com.charissa.leetcode;

/**
 * 557. Reverse Words in a String III
 */
public class ReverseWordsIII {
    public static String reverseWords(String s) {
        if (s == null) {
            return null;
        }

        String[] arr = s.split(" ");
        if (arr.length == 0) {
            return "";
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < arr.length; i++) {
            sb.append(reverse(arr[i]));
            if (i != arr.length -1) {
                sb.append(" ");
            }
        }

        return sb.toString();
    }

    private static String reverse(String s) {
        StringBuilder sb = new StringBuilder();
        char[] arr = s.toCharArray();
        for (int i = arr.length - 1; i >= 0; i--) {
            sb.append(arr[i]);
        }

        return sb.toString();
    }

    public static void main (String... argv) {
        System.out.println("res = " + reverseWords("ab cd"));
    }
}
