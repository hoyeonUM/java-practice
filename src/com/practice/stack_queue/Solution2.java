package com.practice.stack_queue;

import java.util.*;

public class Solution2 {
    public int run(int[] priorities, int location) {

        Queue<Doc> queue = new LinkedList<>();
        for (int i = 0; i < priorities.length; i++) {
            queue.add(new Doc(i, priorities[i]));
        }

        int printCount = 0;
        while (queue.isEmpty() == false) {
            Doc doc = queue.poll();
            if (location < 0) {
                location = queue.size();
            }
            if (queue.stream().anyMatch(v -> v.getPriority() > doc.getPriority())) {
                queue.add(doc);
                continue;
            }
            printCount++;
            if (doc.getLocation() == location) {
                return printCount;
            }
        }

        return printCount;
    }

    private class Doc
    {
        private int location;
        private int priority;

        public Doc(int location, int priority) {
            this.location = location;
            this.priority = priority;
        }

        public int getLocation() {
            return location;
        }

        public int getPriority() {
            return priority;
        }
    }
}