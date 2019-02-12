package com.practice.heap;


import java.util.PriorityQueue;
import java.util.Queue;


public class Solution3 {
    public int run(int[][] jobs) {
        Queue<Task> q = new PriorityQueue<>();
        for (int[] job : jobs) {
            q.offer(new Task(job));
        }

        int workCount = q.size();
        int currentTime = 0;
        int time = 0;
        while (!q.isEmpty()) {
            Task t = q.poll();
            int delayTime = 0;
            if (currentTime - t.getStartTime() < 0) {
                delayTime = Math.abs(currentTime - t.getStartTime());
            }
            time += currentTime + t.getWorkingTime() - t.getStartTime();
            currentTime += t.getWorkingTime() + delayTime;
        }


        return (int) Math.floor(time / workCount);
    }

    private class Task implements Comparable<Task> {

        public int getStartTime() {
            return startTime;
        }

        public int getWorkingTime() {
            return workingTime;
        }

        private int startTime;

        private int workingTime;

        public Task(int[] job) {
            this.startTime = job[0];
            this.workingTime = job[1];
        }

        @Override
        public int compareTo(Task o) {
            if (this.getStartTime() == o.getStartTime()) {
                return this.getWorkingTime() - o.getWorkingTime();
            }

            return Integer.compare(this.getStartTime(), o.getStartTime());
        }
    }
}
