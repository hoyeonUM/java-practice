package com.practice.stack_queue;


import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Solution1Test {

    @Test
    public void basicTest() {
        Solution1 solution = new Solution1();
        String args = "()(((()())(())()))(())";
        assertEquals(17, solution.run(args));;
    }
}
