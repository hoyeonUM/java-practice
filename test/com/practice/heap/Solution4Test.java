package com.practice.heap;


import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class Solution4Test {

    @Test
    public void basicTest() {
        Solution4 solution = new Solution4();
        String [] operations = {"I 7", "I 5", "I-5", "D-1"};
        int [] expect = {7, 5};

        assertArrayEquals(expect, solution.run(operations));
    }

    @Test
    public void basicTest2() {
        Solution4 solution = new Solution4();
        String [] operations = {"I 16", "D 1"};
        int [] expect = {0, 0};

        assertArrayEquals(expect, solution.run(operations));
    }
}
