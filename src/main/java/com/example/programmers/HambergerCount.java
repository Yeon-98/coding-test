package main.java.com.example.programmers;

class HambergerCount {
    public int solution(int[] ingredient) {
        int answer = 0;
        String string = "";
        for(int i : ingredient)
        {
            string += String.valueOf(i);
        }

        while(string.contains("1231"))
        {
            answer++;
            string = string.replace("1231","");
        }

        return answer;
    }
}

//내가 만든 답인데 시간 초과했다..
//stack을 사용해서 1231이 완성되면 pop해서 제거하는 방식으로 해결하는 것이 옳다.
//stack에서도 get이 가능하다는 것을 알았다.