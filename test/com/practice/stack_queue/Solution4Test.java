package com.practice.stack_queue;


import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Solution4Test {

    @Test
    public void basicTest() {
        Solution4 solution = new Solution4();
        int[] progresses = {93,30,55};
        int[] speeds = {1,30,5};
        int [] expected = {2, 1};
        int[] result = solution.run(progresses,speeds);
        assertEquals(expected[0], result[0]);
        assertEquals(expected[1], result[1]);
    }

    @Test
    public void allSameDue() {
        Solution4 solution = new Solution4();
        int[] progresses = {93,93,93};
        int[] speeds = {1,1,1};
        int [] expected = {3};
        int[] result = solution.run(progresses,speeds);
        assertEquals(expected[0], result[0]);
    }

    @Test
    public void allDifferentDue() {
        Solution4 solution = new Solution4();
        int[] progresses = {93,93,93};
        int[] speeds = {3,2,1};
        int [] expected = {1, 1, 1};
        int[] result = solution.run(progresses,speeds);
        assertEquals(expected[0], result[0]);
        assertEquals(expected[1], result[1]);
        assertEquals(expected[2], result[2]);
    }

}
