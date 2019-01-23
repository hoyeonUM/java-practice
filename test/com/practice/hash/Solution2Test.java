package com.practice.hash;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class Solution2Test {
    @Test
    public void duplicatePrefix() {
        Solution2 solution = new Solution2();
        String[] participant = {"119", "97674223", "1195524421"};
        assertFalse(solution.run(participant));
    }

    @Test
    public void notDuplicatePrefix() {
        Solution2 solution = new Solution2();
        String[] participant = {"123", "456", "789"};
        assertTrue(solution.run(participant));
    }

    @Test
    public void multiDuplicatePrefix() {
        Solution2 solution = new Solution2();
        String[] participant = {"12", "123", "1235", "567", "88"};
        assertFalse(solution.run(participant));
    }

}
