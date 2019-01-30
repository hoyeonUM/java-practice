package com.practice.stack_queue;


import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Solution3Test {

    @Test
    public void basicTest() {
        Solution3 solution = new Solution3();
        int[] args = {7,4,5,6};
        assertEquals(8, solution.run(2, 10, args));
    }

    @Test
    public void basicTest2() {
        Solution3 solution = new Solution3();
        int[] args = {10};
        assertEquals(101, solution.run(100, 100, args));
    }

    @Test
    public void basicTest3() {
        Solution3 solution = new Solution3();
        int[] args = {10,10,10,10,10,10,10,10,10,10};
        assertEquals(110, solution.run(100, 100, args));
    }

    @Test
    public void basicTest4() {
        Solution3 solution = new Solution3();
        int[] args = {9, 9, 9};
        assertEquals(13, solution.run(4, 9, args));
    }

    @Test
    public void basicTest5() {
        Solution3 solution = new Solution3();
        int[] args = new int[10000];
        for(int i = 0; i < 10000; i++) {
            args[i] = 9;
        }
        assertEquals(10001, solution.run(1, 9, args));
    }
}
