package com.practice.stack_queue;

import java.util.*;

public class Solution3 {
    public int run(int bridge_length, int weight, int[] truck_weights) {
        return cheat(bridge_length, weight, truck_weights);
    }

    public int cheat(int bridge_length, int weight, int[] truck_weights) {
        //발상의 전환이다..
        //https://oneshottenkill.tistory.com/340 참조함.
        Queue<Integer> bridge = new LinkedList<>();
        for (int i = 0; i < bridge_length; i++) {
            bridge.offer(0);
        }
        List<Integer> truck = new ArrayList<>();
        for (int i = 0; i < truck_weights.length; i++) {
            truck.add(truck_weights[i]);
        }

        int sec = 0;
        while (!bridge.isEmpty()) {
            sec++;
            bridge.poll();
            if (truck.isEmpty()) {
                continue;
            }

            int sum = bridge.stream().mapToInt(v -> v).sum();
            if (sum + truck.get(0) <= weight) {
                bridge.offer(truck.get(0));
                truck.remove(0);
                continue;
            }
            bridge.offer(0);
        }
        return sec;
    }
    private int firstPractice(int bridge_length, int weight, int[] truck_weights)
    {
        List<Truck> list = new ArrayList<>();
        for (int i = 0; i < truck_weights.length; i++) {
            list.add(new Truck(truck_weights[i]));
        }

        int sec = 0;
        int currentIndex = 0;
        while (!list.isEmpty()) {
            int currentTime = ++sec;
            boolean isWaitingExist = list.stream()
                    .filter(v -> v.getStatus().equals(Status.WAITING)).count() > 1;
            if(list.get(currentIndex).getStatus().equals(Status.WAITING)) {
                list.get(currentIndex).setStartSec(currentTime -1);
                list.get(currentIndex).setStatus(Status.DOING);
            }
            int currentWeight = list.stream()
                    .filter(v -> v.getStatus().equals(Status.DOING))
                    .mapToInt(v -> v.getWeight()).sum();
            if(isWaitingExist && (currentWeight + list.get(currentIndex+1).getWeight()) <= weight) {
                currentIndex++;
            }
            if(list.removeIf(v -> (currentTime - v.getStartSec()) >= bridge_length)) {
                currentIndex += currentIndex == 0 ? 0 : -1;
            }
        }
        return sec + 1;
    }
    private enum Status {
        WAITING, DOING
    }
    private class Truck {
        private int startSec = Integer.MAX_VALUE;
        private int weight;
        private Status status = Status.WAITING;

        public Truck(int weight)
        {
            this.weight = weight;
        }

        public void setStartSec(int startSec) {
            this.startSec = startSec;
        }

        public int getStartSec() {
            return startSec;
        }

        public Status getStatus() {
            return status;
        }

        public void setStatus(Status status) {
            this.status = status;
        }

        public int getWeight() {
            return weight;
        }
    }
}