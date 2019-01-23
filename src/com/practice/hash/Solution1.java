package com.practice.hash;

import java.util.*;

public class Solution1 {
    public String run(String[] participant, String[] completion) {
        //firstPractice(participant, completion); //Performance failure
        //secondPractice(participant, completion); //Performance failure
        //thirdPractice(participant, completion); //Performance failure
        return cheat(participant, completion);
    }

    private String firstPractice(String[] participant, String[] completion)
    {
        List<String> list =  new ArrayList<>(Arrays.asList(participant));
        for (String s :  completion) {
            int findIdx = list.indexOf(s);
            if (findIdx > -1) {
                list.remove(findIdx);
            }
        }
        return list.get(0);
    }

    private String secondPractice(String[] participant, String[] completion)
    {
        boolean find = false;
        for (int i = 0; i < completion.length ; i++) {
            for (int ii = 0; ii < participant.length ; ii++) {
                if (completion[i].equals(participant[ii])) {
                    participant[ii] = "";
                    find = true;
                    break;
                }
            }
            if(!find) {
                return completion[i];
            }
        }
        return String.join("", participant);
    }

    private String thirdPractice(String[] participant, String[] completion)
    {
        for (String c : completion) {
            boolean find = false;
            int i = -1;
            for (String p : participant) {
                i++;
                if (c.equals(p)) {
                    participant[i] = "";
                    find = true;
                    break;
                }
            }
            if(!find) {
                return c;
            }
        }
        return String.join("", participant);
    }

    private String cheat(String[] participant, String[] completion)
    {
        Arrays.sort(participant);
        Arrays.sort(completion);
        int i;
        for ( i=0; i<completion.length; i++){

            if (!participant[i].equals(completion[i])){
                return participant[i];
            }
        }
        return participant[i];
    }

}
