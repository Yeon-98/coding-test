package main.java.com.example.programmers;

import java.util.*;

class PhotoScore {
    public int[] solution(String[] name, int[] yearning, String[][] photo) {
        int[] answer = new int[photo.length];
        int idx=0;
        int score = 0;

        Map<String, Integer> map = new HashMap<>();

        for(String N : name)
        {
            map.put(N,yearning[idx++]);
        }

        idx = 0;

        for(String[] strArray:photo)
        {
            score = 0;
            for(String person : strArray)
                if(map.containsKey(person))
                    score += map.get(person);
            answer[idx++] = score;
        }


        return answer;
    }
}

/* int array를 이용하는 것 보다 map을 탐색하는 것이 시간복잡도 훨씬 좋다!