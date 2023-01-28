package com.charissa.leetcode;

import java.util.Arrays;

/**
 * 26. Remove Duplicates from Sorted Array
 */
public class RemoveDuplicatesArrays {
    public static int removeDuplicates(int[] nums) {
        int k = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i - 1] == nums[i]) {
                continue;
            }

            nums[k++] = nums[i];
        }

        return k;
    }

    public static void main (String... argv) {
        int[] arr = new int[] { 1, 1, 2 };
        System.out.println("expected result is 2 and array is [1, 2]: " + removeDuplicates(arr) + ";" + Arrays.toString(arr));
    }
}
