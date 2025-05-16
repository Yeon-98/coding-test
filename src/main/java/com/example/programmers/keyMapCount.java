package main.java.com.example.programmers;

import java.util.*;

class KeyMapCount {
    public int[] solution(String[] keymap, String[] targets){
        Map<Character, Integer> map = new HashMap<>();

        for(String keyString : keymap)
        {
            for( int i = 0 ; i<keyString.length(); i++)
            {
                if(map.containsKey(keyString.charAt(i)))
                {
                    map.put(keyString.charAt(i),Math.min(map.get(keyString.charAt(i)), i+1));
                }
                else
                    map.put(keyString.charAt(i), i+1);
            }
        }

        int[] answer = new int[targets.length];
        int count = 0;
        int idx = 0;

        for (String rep : targets)
        {
            count = 0;

            for(int i =0; i<rep.length(); i++)
            {
                if(map.containsKey(rep.charAt(i)))
                {
                    count += map.get(rep.charAt(i));
                }
                else
                {
                    count = 0;
                    break;
                }
            }

            if(count == 0)
                answer[idx] = -1;
            else
                answer[idx] = count;
            idx++;

        }

        return answer;
    }
}

/*
    시간이 오래걸린 문제. 주먹구구로 머리 속에 떠오른 것을 코드로 바로 옮기지말고 머리 속으로 로직을 정리하고
    코딩은 나중에 하도록 하자
    keyString.charAt() 같이 길고 반복되는 객체는 식별자로 선언하자. 왜 안했는지..
 */
