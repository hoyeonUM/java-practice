package com.practice.stack_queue;


import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class Solution4Test {

    @Test
    public void basicTest() {
        Solution4 solution = new Solution4();
        int[] progresses = {93,30,55};
        int[] speeds = {1,30,5};
        int [] expected = {2, 1};
        assertArrayEquals(expected, solution.run(progresses, speeds));

    }

    @Test
    public void allSameDue() {
        Solution4 solution = new Solution4();
        int[] progresses = {93,93,93};
        int[] speeds = {1,1,1};
        int [] expected = {3};
        assertArrayEquals(expected, solution.run(progresses, speeds));
    }

    @Test
    public void allDifferentDue() {
        Solution4 solution = new Solution4();
        int[] progresses = {93,93,93};
        int[] speeds = {3,2,1};
        int [] expected = {1, 1, 1};
        assertArrayEquals(expected, solution.run(progresses, speeds));
    }

}
