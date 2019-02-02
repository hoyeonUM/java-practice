package com.practice.stack_queue;


import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class Solution5Test {

    @Test
    public void basicTest() {
        Solution5 solution = new Solution5();
        int [] input = {6,9,5,7,4};
        int [] output = {0,0,2,2,4};
        assertArrayEquals(output, solution.run(input));
    }

    @Test
    public void basicTest2() {
        Solution5 solution = new Solution5();
        int [] input = {3,9,9,3,5,7,2};
        int [] output = {0,0,0,3,3,3,6};
        assertArrayEquals(output, solution.run(input));
    }

    @Test
    public void basicTest3() {
        Solution5 solution = new Solution5();
        int [] input = {1,5,3,6,7,6,5};
        int [] output = {0,0,2,0,0,5,6};
        assertArrayEquals(output, solution.run(input));
    }

}
