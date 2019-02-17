package com.practice.sort;


import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class Solution3Test {

    @Test
    public void basicTest() {
        Solution3 solution = new Solution3();
        int[] citations = {3, 0, 6, 1, 5};
        assertEquals(3, solution.run(citations));
    }

    @Test
    public void basicTest2() {
        Solution3 solution = new Solution3();
        int[] citations = {5, 5, 5, 5};
        assertEquals(4, solution.run(citations));
    }
}
