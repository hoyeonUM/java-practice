package com.practice.sort;


import com.practice.sort.Solution1;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class Solution1Test {

    @Test
    public void basicTest() {
        Solution1 solution = new Solution1();
        int[] arr = {1, 5, 2, 6, 3, 7, 4};
        int[][] commands = {{2,5,3}, {4,4,1}, {1,7,3}};
        int [] result = {5,6,3};

        assertArrayEquals(result, solution.run(arr, commands));
    }


}
