package com.practice.sort;


import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class Solution2Test {

    @Test
    public void basicTest() {
        Solution2 solution = new Solution2();
        int[] numbers = {6, 10, 2};
        assertEquals("6210", solution.run(numbers));
    }

    @Test
    public void basicTest2() {
        Solution2 solution = new Solution2();
        int[] numbers = {3, 30, 34, 5, 9};
        assertEquals("9534330", solution.run(numbers));
    }


}
