package com.practice.hash;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Solution4Test {
    @Test
    public void duplicatePrefix() {
        Solution4 solution = new Solution4();
        String[] genres = {"classic", "pop", "classic", "classic", "pop"};
        int[] plays = {500, 600, 150, 800, 2500};
        int[] result = solution.run(genres, plays);
        assertEquals(4, result[0]);
        assertEquals(1, result[1]);
        assertEquals(3, result[2]);
        assertEquals(0, result[3]);
    }

}
