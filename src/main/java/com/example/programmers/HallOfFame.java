package main.java.com.example.programmers;

import java.util.*;

class HallOfFame {
    public int[] solution(int k, int[] score) {
        int[] answer = new int[score.length];

        ArrayList<Integer> list = new ArrayList<>(k);

        for (int i = 0; i < score.length; i++) {
            list.add(score[i]);
            Collections.sort(list);
            if (list.size() > k) {
                list.remove(0);
            }
            answer[i] = list.get(0);
        }
        return answer;
    }
}

/*
Programmers Level1 / 명예의 전당 문제

시간초과로 틀린 문제다.
ArrayList를 sort 할 경우 O(k logk) 시간 복잡도를 가진다.
remove(0)는 index 0을 삭제하고 한 칸씩 당기므로 O(k)
전체 코드는 O(n klogk)시간복잡도를 가진다.

PriorityQueue를 사용하면 시간복잡도도, 구현도 더욱 간단하다.

import java.util.*;

class Solution {
    public int[] solution(int k, int[] score) {
        int[] answer = new int[score.length];
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for (int i = 0; i < score.length; i++) {
            pq.offer(score[i]);

            if (pq.size() > k) {
                pq.poll();
            }

            answer[i] = pq.peek();
        }

        return answer;
    }
}
 */