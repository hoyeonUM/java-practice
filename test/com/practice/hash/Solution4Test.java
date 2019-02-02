package com.practice.hash;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class Solution4Test {
    @Test
    public void duplicatePrefix() {
        Solution4 solution = new Solution4();
        String[] genres = {"classic", "pop", "classic", "classic", "pop"};
        int[] plays = {500, 600, 150, 800, 2500};
        int[] expected = {4, 1, 3, 0};
        assertArrayEquals(expected, solution.run(genres, plays));
    }

}
