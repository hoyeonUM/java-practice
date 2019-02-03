package com.practice.heap;

import java.util.*;

public class Solution1 {
    public int run(int[] scoville, int K) {
        Queue<Integer> q = new PriorityQueue<>();
        for (int s : scoville) {
            q.offer(s);
        }

        int makeCount = 0;
        while (true) {
            if(q.peek() >= K || q.size() == 1) {
                break;
            }
            q.offer(q.poll() + (q.poll() * 2));
            ++makeCount;
        }

        return q.peek() < K ? -1 : makeCount;
    }

    /*public int firstPractice(int[] scoville, int K) {
        List<Integer> list = new ArrayList<>();
        for (int s : scoville) {
            list.add(s);
        }


        int makeCount = 0;
        while (list.stream().filter(v -> v < K).toArray().length > 0) {
            if(list.size() == 1) {
                break;
            }
            list = list.stream().sorted().collect(Collectors.toList());
            makeCount++;
            int makeNewFood = list.get(0) + (list.get(1) * 2);
            list.remove(0);
            list.remove(0);
            list.add(makeNewFood);
        }

        return (list.stream().filter(v -> v < K).toArray().length > 0) ? -1 : makeCount;
    }*/


    /*public int secondPractice(int[] scoville, int K) {
        int makeCount = 0;
        while (true) {
            Arrays.sort(scoville);
            if (scoville.length - makeCount < 2 || scoville[makeCount] >= K ) {
                break;
            }

            int makeNewFood = scoville[makeCount] + (scoville[makeCount+1] * 2);
            scoville[makeCount] = -1;
            scoville[++makeCount] = makeNewFood;

        }
        return scoville[makeCount] < K ? -1 : makeCount;
    }*/
}
