package main.java.com.example.programmers;/* 어떤 문자열에 대해서 접두사는 특정 인덱스까지의 문자열을 의미합니다. 예를 들어, "banana"의 모든 접두사는 "b", "ba", "ban", "bana", "banan", "banana"입니다.
문자열 my_string과 is_prefix가 주어질 때, is_prefix가 my_string의 접두사라면 1을, 아니면 0을 return 하는 solution 함수를 작성해 주세요.


 */

class StringEquals {
    public int solution(String my_string, String is_prefix) {
        int answer = 0;
        String rep ="";
        for(int i=0; i<my_string.length(); i++)
        {
            rep +=my_string.charAt(i);
            if(rep.equals(is_prefix))
            {
                answer = 1;
                break;
            }
        }
        return answer;
    }
}

/* rep.equls()가 아닌 ==로 비교하면 문자열이 같아도 false. String은 참조타입이기 때문에 서로 다른 메모리
위치를 가리키기 때문.
 */