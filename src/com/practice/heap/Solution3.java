package com.practice.heap;


import java.util.PriorityQueue;


public class Solution3 {
    public int run(int[][] jobs)  {
        PriorityQueue<Job> sortByStartTimeQ = new PriorityQueue<>((a, b) -> {
            int diff = a.startTime - b.startTime;
            if (diff == 0) {
                return a.spendTime - b.spendTime;
            }
            return diff;
        });
        PriorityQueue<Job> sortBySpendTimeQ = new PriorityQueue<>((a, b) -> {
            int diff = a.spendTime - b.spendTime;
            if (diff == 0) {
                return a.startTime - b.startTime;
            }
            return diff;
        });

        for(int i = 0; i < jobs.length; i++) {
            sortByStartTimeQ.add(new Job(jobs[i][0], jobs[i][1]));
        }

        int endTime = sortByStartTimeQ.peek().startTime + sortByStartTimeQ.peek().spendTime;
        int result = sortByStartTimeQ.peek().spendTime;
        sortByStartTimeQ.poll();
        Job current;
        while(!sortByStartTimeQ.isEmpty()) {
            if (!sortBySpendTimeQ.isEmpty() && endTime <= sortByStartTimeQ.peek().startTime) {
                current = sortBySpendTimeQ.poll();
                endTime += current.spendTime;
                result += endTime - current.startTime;
                continue;
            }
            sortBySpendTimeQ.add(sortByStartTimeQ.poll());
        }

        while (!sortBySpendTimeQ.isEmpty()) {
            current = sortBySpendTimeQ.poll();
            endTime += current.spendTime;
            result += endTime - current.startTime;
        }

        return result / jobs.length;
    }
}
class Job {
    int startTime, spendTime;
    public Job(int startTime, int spendTime) {
        this.startTime = startTime;
        this.spendTime = spendTime;
    }
}

