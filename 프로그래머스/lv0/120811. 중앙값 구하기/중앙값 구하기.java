import java.util.*;

class Solution {
    public int solution(int[] array) {
        int answer = 0;
        Arrays.sort(array);
        int size = array.length;
        answer = array[(size/2)];
        return answer;
    }
}