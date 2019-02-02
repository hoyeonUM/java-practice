package com.practice.stack_queue;

public class Solution6 {

    public int[] run(int[] prices) {
        int[] answer = new int[prices.length];
        for (int currentPrice = 0;  currentPrice < prices.length; currentPrice++) {
            for (int nextPrice = currentPrice + 1; nextPrice < prices.length; nextPrice++) {
                if (prices[currentPrice] > prices[nextPrice] || (nextPrice+1 == prices.length)) {
                    answer[currentPrice] = nextPrice - currentPrice;
                    break;
                }
            }
        }
        return answer;
    }
}
