package com.practice.heap;


import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Solution2Test {

    @Test
    public void basicTest() {
        Solution2 solution = new Solution2();
        int stock = 4;
        int[] dates = {4, 10, 15};
        int[] supplies = {20, 5, 10};
        int k = 30;

        assertEquals(2, solution.run(stock, dates, supplies, k));
    }

    @Test
    public void basicTest2() {
        Solution2 solution = new Solution2();
        int stock = 1;
        int[] dates = {1, 3, 7, 9};
        int[] supplies = {100, 100, 100, 100};
        int k = 45;

        assertEquals(1, solution.run(stock, dates, supplies, k));
    }

    @Test
    public void basicTest3() {
        Solution2 solution = new Solution2();
        int stock = 4;
        int[] dates = {3, 13, 26, 43};
        int[] supplies = {10, 17, 15, 9};
        int k = 44;

        assertEquals(3, solution.run(stock, dates, supplies, k));
    }
}
