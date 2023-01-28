package com.charissa.leetcode;

/**
 * 1047. Remove All Adjacent Duplicates In String
 */
public class RemoveDuplicatesString {
    public static String removeDuplicates(String s) {
        StringBuffer sb = new StringBuffer();
        char[] chs = s.toCharArray();
        for (char ch : chs) {
            int len = sb.length();
            if (len > 0 && sb.charAt(len -1) == ch) {
                sb.deleteCharAt(len -1);
            } else {
                sb.append(ch);
            }
        }

        return sb.toString();
    }

    public static void main (String... argv) {
        System.out.println("expected result is ca: " + removeDuplicates("abbaca"));
        System.out.println("expected result is ay: " + removeDuplicates("azxxzy"));
    }
}
