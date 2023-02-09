package com.charissa.leetcode;

/**
 * 1071. Greatest Common Divisor of Strings
 */
public class GreateCommonDivisor {
    public static String gcdOfStrings(String str1, String str2) {
        String[] arr = sortString(str1, str2);

        int count = 1;
        String divisor = arr[1];
        while (divisor.length() > 0) {
            if (canDivid(arr[0], divisor) && canDivid(arr[1], divisor)) {
                return divisor;
            }

            count++;
            divisor = arr[1].substring(0, arr[1].length() / count);
        }

        return "";
    }

    private static String[] sortString(String s1, String s2) {
        int l1 = s1.length(), l2 = s2.length();
        if (l1 > l2) {
            return new String[] { s1, s2 };
        }

        return new String[] { s2, s1 };
    }

    private static boolean canDivid(String s, String d) {
        int slen = s.length(), dlen = d.length();
        if (slen % dlen != 0) {
            return false;
        }

        int c = 0;
        int n = slen / dlen;
        while (c < n) {
            String sub = s.substring(c * dlen, (c + 1) * dlen);
            if (!sub.equals(d)) {
                return false;
            }
            c++;
        }

        return true;
    }

    public static void main (String... argv) {
        System.out.println("ans should be 'ABC'; and actual ans is: " + gcdOfStrings("ABCABC", "ABC"));
        System.out.println("ans should be 'AB'; and actual ans is:  " + gcdOfStrings("ABABAB", "ABAB"));
        System.out.println("ans should be ''; and actual ans is:  " + gcdOfStrings("LEET", "CODE"));
    }
}
