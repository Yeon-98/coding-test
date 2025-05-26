package main.java.com.example.programmers;

class CardGame {
    public String solution(String[] cards1, String[] cards2, String[] goal) {
        String answer = "";
        int idx1=0;
        int idx2=0;

        for(String string : goal)
        {

            if(idx1 <cards1.length && cards1[idx1].equals(string))
            {
                idx1++;
                continue;
            }
            if(idx2 < cards2.length && cards2[idx2].equals(string))
            {
                idx2++;
                continue;
            }

            answer = "No";
            return answer;
        }

        answer = "Yes";
        return answer;
    }
}

//idx1과 idx2의 범위를 지정하지않아 오류가 발생했다. 컴파일 오류가 발생할 때 원인을 빠르게 파악할 수 있도록 