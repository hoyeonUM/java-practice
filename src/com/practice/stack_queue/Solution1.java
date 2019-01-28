package com.practice.stack_queue;

import java.util.Stack;

public class Solution1 {
    public int run(String arrangement) {
        int answer = 0;
        Stack<Integer> stack = new Stack<>();
        arrangement = arrangement.replace("()", "#");
        for(int i = 0; i < arrangement.length(); i++) {
            if(arrangement.charAt(i) == '#') {
                answer += stack.size();
                continue;
            }
            if (arrangement.charAt(i) == '(') {
                stack.add(0);
                continue;
            }
            stack.pop();
            answer++;
        }
        return answer;
    }
}
