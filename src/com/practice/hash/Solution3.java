package com.practice.hash;

import java.util.*;

public class Solution3 {
    public int run(String[][] clothes) {
        Map<String, Set<String>> map = new HashMap<>();
        for(int i = 0; i < clothes.length; i++) {
            if (map.get(clothes[i][1]) == null) {
                Set<String> set = new HashSet<>();
                set.add(clothes[i][0]);
                map.put(clothes[i][1], set);
                continue;
            }
            map.get(clothes[i][1]).add(clothes[i][0]);
        }

        int totalSize = 1;
        for (Map.Entry<String, Set<String>> entry : map.entrySet()) {
            totalSize *= entry.getValue().size()+1;
        }
        return totalSize - 1;
    }
}
