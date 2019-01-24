package com.practice.hash;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class Solution3Test {
    @Test
    public void duplicatePrefix() {
        Solution3 solution = new Solution3();
        String[][] participant = {{"yellow_hat", "headgear"}, {"blue_sunglasses", "eyewear"}, {"green_turban", "headgear"}};
        assertEquals(5, solution.run(participant));
    }

    @Test
    public void duplicatePrefix2() {
        Solution3 solution = new Solution3();
        String[][] participant = {{"crow_mask", "face"}, {"blue_sunglasses", "face"}, {"smoky_makeup", "face"}};
        assertEquals(3, solution.run(participant));
    }


}
