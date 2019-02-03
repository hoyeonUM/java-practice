package com.practice.heap;


import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Solution1Test {

    @Test
    public void basicTest() {
        Solution1 solution = new Solution1();
        int[] scoville = {1, 2, 3, 9, 10, 12};
        int K = 7;

        assertEquals(2, solution.run(scoville, K));
    }

    @Test
    public void zreoScoville() {
        Solution1 solution = new Solution1();
        int[] scoville = {1, 2, 3, 9, 10, 12};
        int K = 0;

        assertEquals(0, solution.run(scoville, K));
    }

    @Test
    public void scovilleCantPass() {
        Solution1 solution = new Solution1();
        int[] scoville = {1, 1};
        int K = 10;

        assertEquals(-1, solution.run(scoville, K));
    }

    @Test
    public void oneScovilleIsPass() {
        Solution1 solution = new Solution1();
        int[] scoville = {0};
        int K = 0;

        assertEquals(0, solution.run(scoville, K));
    }

    @Test
    public void oneScovilleIsButCantPass() {
        Solution1 solution = new Solution1();
        int[] scoville = {1};
        int K = 2;

        assertEquals(-1, solution.run(scoville, K));
    }

    @Test
    public void makeSameScoville() {
        Solution1 solution = new Solution1();
        int[] scoville = {1, 1, 1};
        int K = 5;

        assertEquals(2, solution.run(scoville, K));
    }
}
