package com.charissa.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * 1323. Maximum 69 Number
 */
public class Max69Number {
    public static int maximum69Number (int num) {
        List<Integer> digs =  new ArrayList<>();
        while (num / 10 > 0 )
        {
            digs.add (num % 10);
            num = num / 10;
        }

        digs.add(num);

        int res = 0;
        boolean changed = false;
        for (int i = digs.size() -1 ; i >= 0; i--) {
            int d = digs.get(i);
            if (d != 9 && !changed) {
                d = 9;
                changed = true;
            }

            res = res * 10 + d;
        }

        return res;
    }

    public static void main (String... argv) {
        System.out.println("expected res is 9969: " + maximum69Number(9669));
    }
}
