package com.practice.stack_queue;

public class Solution5 {

    public int[] run(int[] heights) {
        int[] answer = new int[heights.length];
        for (int send = heights.length - 1; send >= 0 ; send--) {
            for (int receive = send - 1; receive >= 0 ; receive--) {
                if (heights[send] < heights[receive]) {
                    answer[send] = receive+1;
                    break;
                }
            }
        }
        return answer;
    }
}
