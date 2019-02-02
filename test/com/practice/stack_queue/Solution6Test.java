package com.practice.stack_queue;


import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class Solution6Test {

    @Test
    public void basicTest() {
        Solution6 solution = new Solution6();
        int [] input = {498,501,470,489};
        int [] output = {2,1,1,0};
        assertArrayEquals(output, solution.run(input));
    }
}
