package com.charissa.leetcode;

import java.util.Stack;

/**
 * 20: Valid Parentheses
 */
public class ValidParentheses {
    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        char[] chs = s.toCharArray();
        for (int i = 0; i < chs.length; i++) {
            Character cur = chs[i];
            if (cur == '(' || cur == '{' || cur == '[') {
                stack.push(chs[i]);
            } else {
                Character ch = stack.peek();
                if (cur == ')' && ch != '(') {
                    return false;
                }
                if (cur == '}' && ch != '{') {
                    return false;
                }
                if (cur == ']' && ch != '[') {
                    return false;
                }

                stack.pop();
            }
        }

        return stack.empty();
    }

    public static void main (String... argv) {
        System.out.println("is valid: ()" + isValid("()"));
        System.out.println("is valid: ()[]{}" + isValid("(}"));

    }
}
