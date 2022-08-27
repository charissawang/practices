package com.charissa.leetcode;

/**
 * 14: Longest Common Prefix
 */
public class LongestCommonPrefix {
    public static String longestCommonPrefix(String[] strs) {
        StringBuilder sb = new StringBuilder();

        String common = strs[0];
        for (int i = 1; i < strs.length; i++) {
            common = findCommon(common, strs[i]);
            if (common.length() == 0) {
                return "";
            }
        }

        return common;
    }

    private static String findCommon(String s1, String s2) {
        char[] ch1 = s1.toCharArray();
        char[] ch2 = s2.toCharArray();

        StringBuilder sb = new StringBuilder();
        int len = ch1.length > ch2.length ? ch2.length : ch1.length;
        for ( int i = 0; i < len; i++ ) {
            if (ch1[i] != ch2[i]) {
                break;
            }

            sb.append(ch1[i]);
        }
        return sb.toString();
    }

    public static void main (String... argv) {
        String[] strs = new String[] {"flower","flow","flight" };
        System.out.println("common prex: " + longestCommonPrefix(strs));

        strs = new String[] {"dog","racecar","car" };
        System.out.println("common prex: " + longestCommonPrefix(strs));
    }
}
