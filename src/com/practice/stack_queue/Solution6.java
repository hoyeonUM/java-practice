package com.practice.stack_queue;

public class Solution6 {

    public int[] run(int[] prices) {
        int[] answer = new int[prices.length];
        for (int currentPriceIndex = 0;  currentPriceIndex < prices.length; currentPriceIndex++) {
            for (int nextPriceIndex = currentPriceIndex + 1; nextPriceIndex < prices.length; nextPriceIndex++) {
                if (prices[currentPriceIndex] > prices[nextPriceIndex] || (nextPriceIndex+1 == prices.length)) {
                    answer[currentPriceIndex] = nextPriceIndex - currentPriceIndex;
                    break;
                }
            }
        }
        return answer;
    }
}
