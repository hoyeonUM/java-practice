package com.practice.hash;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Solution4 {
    public class Music implements Comparable<Music> {

        private int played;
        private int id;
        private String genre;

        public Music(String genre, int played, int id) {
            this.genre = genre;
            this.played = played;
            this.id = id;
        }

        @Override
        public int compareTo(Music other) {
            if (this.played == other.played) return this.id - other.id;
            return other.played - this.played;
        }

        public String getGenre() {
            return genre;
        }
    }

    public int[] run(String[] genres, int[] plays) {
        /**
         * 기존 php 와 javascript 에서는 다중배열을 만들기 자유로워서 다중배열로 작업하여서 map , filter 등을 사용하였다.
         * 따라서 java 에서도 기존 방식그대로  Map<Integer, Map<String, Integer>> 이런형태의 자료구조를 만들었지만
         * Map 형태로 들어갈것을 객체로만들고 그객체의 정렬 기준을 Comparable 를 구현하고 stream API 를 통해 정렬할수있다는것을 학습하였다.
         */
        return cheat(genres, plays);
    }

    public int[] cheat(String[] genres, int[] plays)
    {
        return IntStream.range(0, genres.length)
                .mapToObj(i -> new Music(genres[i], plays[i], i))
                .collect(Collectors.groupingBy(Music::getGenre))
                .entrySet().stream()
                .sorted((a, b) -> sum(b.getValue()) - sum(a.getValue()))
                .flatMap(x -> x.getValue().stream().sorted().limit(2))
                .mapToInt(x -> x.id).toArray();
    }
    private int sum(List<Music> value) {
        int answer = 0;
        for (Music music : value) {
            answer += music.played;
        }
        return answer;
    }
}
