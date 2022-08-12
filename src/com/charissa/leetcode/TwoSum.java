package com.charissa.leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 * 1. Two Sum
 */
public class TwoSum {
    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            Integer index = map.get(target - nums[i]);
            if (index != null) {
                return new int[] { index, i };
            }

            map.put(nums[i], i);
        }

        return new int[] { -1, -1 };
    }

    public static void main (String... argv) {
        int[] nums = new int[] { 2,7,11,15 };
        int[] indices = twoSum(nums, 9);
        System.out.println("[" + indices[0] + ", " + indices[1] + "]");

        nums = new int[] { 3,2,4 };
        indices = twoSum(nums, 6);
        System.out.println("[" + indices[0] + ", " + indices[1] + "]");

        nums = new int[] { 3,3 };
        indices = twoSum(nums, 8);
        System.out.println("[" + indices[0] + ", " + indices[1] + "]");
    }
}
