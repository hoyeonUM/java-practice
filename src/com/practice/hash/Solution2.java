package com.practice.hash;

import java.util.Arrays;

public class Solution2 {
    public boolean run(String[] phoneBook) {
        //return firstPractice(phoneBook); //success but cheat is better
        return cheat(phoneBook);
    }

    private boolean firstPractice(String[] phoneBook) {
        Arrays.sort(phoneBook);
        for (int i = 0; i < phoneBook.length; i++) {
            for (int j = i + 1; j < phoneBook.length; j++) {
                if (phoneBook[j].length() < phoneBook[i].length()) {
                    continue;
                }
                if (phoneBook[j].startsWith(phoneBook[i])) {
                    return false;
                }
            }
        }
        return true;
    }

    public boolean cheat(String[] phoneBook) {
        for (int i = 0; i < phoneBook.length - 1; i++) {
            for (int j = i + 1; j < phoneBook.length; j++) {
                if (phoneBook[i].startsWith(phoneBook[j])) {
                    return false;
                }
                if (phoneBook[j].startsWith(phoneBook[i])) {
                    return false;
                }
            }
        }
        return true;
    }

}
