package com.practice.stack_queue;


import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Solution2Test {

    @Test
    public void basicTest() {
        Solution2 solution = new Solution2();
        int[] args = {2, 1, 3, 2};
        assertEquals(1, solution.run(args, 2));
    }

    @Test
    public void  allSameButExceptForOneNumber() {
        Solution2 solution = new Solution2();
        int[] args = {1, 1, 9, 1, 1, 1};
        assertEquals(5, solution.run(args, 0));
    }

    @Test
    public void allSameButExceptForThreeNumber() {
        Solution2 solution = new Solution2();
        int[] args = {2, 2, 2, 1, 3, 4};
        assertEquals(5, solution.run(args, 2));
    }

}
