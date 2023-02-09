package com.charissa.leetcode;

/**
 * 27. Remove Element
 */
public class RemoveElement {
    public static int removeElement(int[] nums, int val) {
        int k = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[k++] = nums[i];
            }
        }

        return k;
    }

    public static void main (String... argv) {
        System.out.println("expected result is 2: actual result: " + removeElement(new int[] {3, 2, 2, 3}, 3));
        System.out.println("expected result is 5: actual result: " + removeElement(new int[] {0,1,2,2,3,0,4,2}, 2));
    }
}
