package com.practice.sort;

import java.util.Arrays;

public class Solution1 {
    public int[] run(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        for(int index = 0; index < commands.length; index++) {
            int []splice = Arrays.stream(Arrays.copyOfRange(array, commands[index][0] - 1, commands[index][1])).sorted().toArray();
            answer[index] = splice[commands[index][2] - 1];
        }
        return answer;
    }
}
