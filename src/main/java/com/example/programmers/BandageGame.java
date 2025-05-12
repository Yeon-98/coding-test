package main.java.com.example.programmers;

import java.util.*;

class BandageGame {
    public int solution(int[] bandage, int health, int[][] attacks) {
        int totalTime = 0;
        int recoverTime = 0;
        int currentHealth = health;

        Map<Integer,Integer>map = new HashMap<>();

        for (int i=0; i<attacks.length; i++)
        {
            map.put(attacks[i][0], attacks[i][1]);
        }

        while(totalTime<attacks[attacks.length-1][0]+1)
        {
            if (map.containsKey(totalTime))
            {
                recoverTime =0;
                currentHealth -=map.get(totalTime);
                if(currentHealth<=0)
                {
                    currentHealth=-1;
                    break;
                }
            }
            else
            {
                currentHealth+=bandage[1];
                if(currentHealth>health)
                    currentHealth = health;
                recoverTime++;
                if(recoverTime==bandage[0])
                {
                    currentHealth+=bandage[2];
                    if(currentHealth>health)
                        currentHealth=health;
                    recoverTime=0;
                }

            }
            totalTime++;
        }


        return currentHealth;
    }
}

/*
class main.java.com.example.programmers.Solution {
    public int solution(int[] bandage, int health, int[][] attacks) {
        int maxHealth = health;
        int maxTime = attacks[attacks.length-1][0];

        int beforeTime = 0;
        int bandageTime = 0;
        for (int[] attack : attacks) {
            bandageTime = attack[0] - beforeTime - 1;
            health = Math.min(maxHealth, health + (bandage[1] * bandageTime));
            if (bandageTime / bandage[0] > 0) {
                health = Math.min(maxHealth, health + bandage[2] * (bandageTime / bandage[0]));
            }

            health -= attack[1];
            beforeTime = attack[0];
            if (health <= 0) return -1;
        }

        return health;
    }
}

조금 더 수학적으로 생각해보면 좋겠다! 
 */