package main.java.com.example.programmers;

class StringSplit {
    public int solution(String s) {
        int rep1=0;
        int rep2=0;
        int answer=0;

        for(int i =0; i<s.length(); i++)
        {
            if(i==s.length())
            {
                answer++;
                break;
            }
            rep1=1;
            rep2=0;

            for(int j = i+1; j<s.length(); j++)
            {
                if(j==s.length()-1)
                {
                    answer++;
                    break;
                }

                if(s.charAt(i)==s.charAt(j))
                    rep1++;
                else
                    rep2++;

                if(rep1 == rep2)
                {
                    i=j;
                    answer++;
                    break;
                }
            }
        }

        return answer;
    }
}

/* 틀림.. edge case에 너무 매몰되서 이상한 구조를 추가했다. 좀 더 넓은 시야에서 일반적인 풀이를 생각하도록 하자
   while문도 좋고, for문에서 char을 하나씩 가져와서 비교하는 것도 좋은 것 같다.

 */
