package main.java.com.example.programmers;

import java.util.*;

// sol 1
/*
class Solution {
    public String[] solution(String[] players, String[] callings) {
        String[] answer = {};
        List<String> list = new LinkedList<>();
        int idx = 0;

        for(String player : players)
        {
            list.add(player);
        }

        for(String called : callings)
        {
            idx = list.indexOf(called);
            String rep = list.get(idx-1);
            list.set(idx-1, called);
            list.set(idx, rep);
        }

        return list.toArray(new String[0]);
    }
}
 */

// sol 2
class RaceGame {
    public String[] solution(String[] players, String[] callings) {

        Map<String, Integer> map = new HashMap<>();
        int idx = 0;

        for(String player : players)
        {
            map.put(player, idx++);
        }

        for(String called : callings)
        {
            idx = map.get(called);
            String rep = players[idx-1];
            players[idx-1] = called;
            players[idx] = rep;

            map.put(called, idx-1);
            map.put(rep, idx);
        }
        return players;
    }
}

/*
sol1으로 먼저 풀이했는데 시간초과해서 sol2로 개선했다.
sol1에서는 객체들의 위치를 바꿔야하니 LinkedList를 써야겠다고 생각했는데 get, index 모두 O(n)이므로 for문에서 O(n^2)이 되버렸다.
그래서 HashMap으로 개선해서 모든 동작이 O(1)이 되어 O(n)으로 개선해서 통과!
 */