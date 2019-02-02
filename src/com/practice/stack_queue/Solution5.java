package com.practice.stack_queue;

public class Solution5 {

    public int[] run(int[] heights) {
        int[] answer = new int[heights.length];
        for (int sendIndex = heights.length - 1; sendIndex >= 0 ; sendIndex--) {
            for (int receiveIndex = sendIndex - 1; receiveIndex >= 0 ; receiveIndex--) {
                if (heights[sendIndex] < heights[receiveIndex]) {
                    answer[sendIndex] = receiveIndex+1;
                    break;
                }
            }
        }
        return answer;
    }
}
