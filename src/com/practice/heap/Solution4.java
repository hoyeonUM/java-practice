package com.practice.heap;

import java.util.Comparator;
import java.util.PriorityQueue;


public class Solution4 {
    public int[] run(String[] operations) {
        PriorityQueue<Integer> q = new PriorityQueue<>();
        PriorityQueue<Integer> reverseQ = new PriorityQueue<>(Comparator.reverseOrder());

        for (int index = 0; index < operations.length; index++ ) {
            String flag = operations[index].substring(0, 1);
            int number = Integer.parseInt(operations[index].substring(1).trim());
            if (flag.equals("I")) {
                q.offer(number);
                reverseQ.offer(number);
                continue;
            }

            if(q.isEmpty()) {
                continue;
            }
            int removeNumber = number < 0 ? q.peek() : reverseQ.peek();

            q.remove(removeNumber);
            reverseQ.remove(removeNumber);
        }

        if (q.isEmpty()) {
            return new int[] {0, 0};
        }
        return new int[] {reverseQ.poll(), q.poll()};
    }
}

