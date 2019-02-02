package com.practice.hash;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Solution3Test {
    @Test
    public void anotherCloth() {
        Solution3 solution = new Solution3();
        String[][] participant = {{"yellow_hat", "headgear"}, {"blue_sunglasses", "eyewear"}, {"green_turban", "headgear"}};
        assertEquals(5, solution.run(participant));
    }

    @Test
    public void allSameCloth() {
        Solution3 solution = new Solution3();
        String[][] participant = {{"crow_mask", "face"}, {"blue_sunglasses", "face"}, {"smoky_makeup", "face"}};
        assertEquals(3, solution.run(participant));
    }


}
