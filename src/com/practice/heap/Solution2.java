package com.practice.heap;

import java.util.Collections;
import java.util.PriorityQueue;


public class Solution2 {
    public int run(int stock, int[] dates, int[] supplies, int k) {
        /**
         * 우선순위큐를 역방향기준으로 정렬.
         * 오늘날짜보다 작거나 같은 날짜로부터 가져올수 있는 밀가루를 전부 가져와서
         * queue.poll 를 진행시 제일많이 가져올수있음.
         */
        return cheat(stock, dates, supplies, k);
    }

    public int cheat(int stock, int[] dates, int[] supplies, int k)
    {
        PriorityQueue<Integer> queue = new PriorityQueue<>(Collections.reverseOrder());
        int answer = 0;
        int day = stock;
        int index = 0;
        while(day < k) {
            while(index < dates.length && dates[index] <= day) {
                queue.offer(supplies[index]);
                index++;
            }
            answer++;
            day += queue.poll();
        }

        return answer;
    }
}
