package com.practice.sort;

import java.util.Arrays;
public class Solution2 {
    public String run(int[] numbers) {

        String [] num = new String[numbers.length];
        for (int i =0; i < num.length;  i++) {
            num[i] = String.valueOf(numbers[i]);
        }

        Arrays.sort(num, (o1, o2) -> (o2 + o1).compareTo(o1 + o2));

        String answer = String.join("", num);
        if (answer.startsWith("0")) {
            return "0";
        }
        return answer;
    }
}