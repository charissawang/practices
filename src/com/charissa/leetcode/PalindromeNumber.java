package com.charissa.leetcode;

/**
 * 9. Palindrome Number
 */
public class PalindromeNumber {
   public static boolean isPalindrome(int x) {
        if (x < 0) {
           return false;
        }
        String s = String.valueOf(x);
        char[] chars = s.toCharArray();
        int len = chars.length;
        for (int i = 0; i < len / 2; i++) {
            if (chars[i] != chars[len - i -1]) {
                return false;
            }
        }

        return true;
   }

   public static void main (String... argv) {
       System.out.println("121 isPalindrome: " + isPalindrome(121));
       System.out.println("-121 isPalindrome: " + isPalindrome(-121));
       System.out.println("10 isPalindrome: " + isPalindrome(10));
       System.out.println("0 isPalindrome: " + isPalindrome(0));
   }
}
