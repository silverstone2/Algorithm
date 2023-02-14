import java.util.*;

class Solution {
    public int solution(int n) {
        int answer = 0;
        while(n>10) {
            answer += n%10;
            n /= 10;
        }
        if(n<10) answer = answer+n;
        return answer;
    }
}