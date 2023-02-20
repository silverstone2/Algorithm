import java.util.*;

class Solution {
    public int[] solution(long n) {
        String str = Long.toString(n);
        int index = 0;
        int[] answer = new int[str.length()];
        
        for(int i=str.length()-1; i>=0; i--) {
            answer[index] = str.charAt(i)-48;
            index++;
        }
        return answer;
    }
}