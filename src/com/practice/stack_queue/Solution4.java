package com.practice.stack_queue;

import java.util.*;

public class Solution4 {
    public int[] run(int[] progresses, int[] speeds) {
        return cheat(progresses, speeds);
    }

    private int[] cheat (int[] progresses, int[] speeds) {
        int[] dayOfend = new int[100];
        int day = -1;
        for (int i = 0; i < progresses.length; i++) {
            while (progresses[i] + (day * speeds[i]) < 100) {
                day++;
            }
            dayOfend[day]++;
        }
        return Arrays.stream(dayOfend).filter(i -> i != 0).toArray();
    }
    private int[] firstPractice (int[] progresses, int[] speeds) {
        Deque<Task> tasks = new LinkedList<>();

        for (int i = 0; i < progresses.length; i++) {
            tasks.offer(new Task(progresses[i], speeds[i]));
        }

        while (tasks.stream().anyMatch(v -> v.progress < 100)) {
            tasks.forEach(v -> v.increaseProgress());
        }

        int dueDay = tasks.poll().day;
        int cnt = 1;
        if (tasks.isEmpty()) {
            return new int[1];
        }

        List<Integer> answer = new ArrayList<>();
        while (!tasks.isEmpty()) {
            Task nextTask = tasks.poll();
            if (dueDay >= nextTask.day) {
                cnt++;
                continue;
            }
            answer.add(cnt);
            cnt = 1;
            dueDay = nextTask.day;
        }
        answer.add(cnt);


        int[] unwrappingAnswer = new int[answer.size()];
        for (int i = 0; i < answer.size(); i++) {
            unwrappingAnswer[i] = answer.get(i).intValue();
        }
        return unwrappingAnswer;
    }

    private class Task {
        public int progress;
        public int speed;
        public int day = 0;

        public Task(int progress, int speed) {
            this.progress = progress;
            this.speed = speed;
        }

        public void increaseProgress() {
            if (progress >= 100) {
                return;
            }
            ++day;
            progress += speed;
        }
    }
}