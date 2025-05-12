package main.java.com.example.programmers;

import java.util.HashMap;
import java.util.Map;

class CharacterDistanceTracker {
    public int[] solution(String s) {
        Map<Character, Integer> map = new HashMap<>();
        int[] answer = new int[s.length()];

        for( int i=0 ; i<s.length(); i++)
        {
            int j=-1;
            if(map.containsKey(s.charAt(i)))
            {
                j = i-map.get(s.charAt(i));
            }
            map.put(s.charAt(i),i);
            answer[i] = j;
        }

        return answer;
    }
}

/*
map 기본 문제
 */