package com.practice.heap;


import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Solution3Test {

    @Test
    public void basicTest() {
        Solution3 solution = new Solution3();
        int[][] jobs = {{0, 3}, {1, 9}, {2, 6}};

        assertEquals(9, solution.run(jobs));
    }

    @Test
    public void basicTest2() {
        Solution3 solution = new Solution3();
        int[][] jobs = {{0, 9}, {0, 4}, {0, 5}, {0, 7}, {0, 3}};

        assertEquals(13, solution.run(jobs));
    }


    @Test
    public void basicTest3() {
        Solution3 solution = new Solution3();
        int[][] jobs = {{0, 9}, {13, 18}, {12, 17}};
        assertEquals(19, solution.run(jobs));
    }

    @Test
    public void basicTest4() {
        Solution3 solution = new Solution3();
        int[][] jobs = {{0, 3}, {0, 3}, {0, 3}};
        assertEquals(6, solution.run(jobs));
    }

    @Test
    public void basicTest5() {
        Solution3 solution = new Solution3();
        int[][] jobs = {{0, 3}, {7, 10}, {2, 3}};
        assertEquals(5, solution.run(jobs));
    }


}
