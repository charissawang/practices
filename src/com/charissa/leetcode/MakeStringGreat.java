package com.charissa.leetcode;

/**
 * 1544. Make The String Great
 */
public class MakeStringGreat {
    public static String makeGood(String s) {
        StringBuilder sb = new StringBuilder();
        char[] chs = s.toCharArray();
        for (char ch : chs) {
            int len = sb.length();
            if (len > 0 && isBad(sb.charAt(len -1), ch)) {
                sb.deleteCharAt(len - 1);
            } else {
                sb.append(ch);
            }
        }

        return sb.toString();

    }

    private static boolean isBad(char c1, char c2) {
        if (Character.toUpperCase(c1) != Character.toUpperCase(c2)) {
            return false;
        }
        if (Character.isUpperCase(c1) && Character.isLowerCase(c2)) {
            return true;
        }

        if (Character.isLowerCase(c1) && Character.isUpperCase(c2)) {
            return true;
        }

        return false;
    }

    public static void main (String... argv) {
        System.out.println("expected result is leetcode: " + makeGood("leEeetcode"));
        System.out.println("expected result is empty String: " + makeGood("abBAcC"));
    }
}
