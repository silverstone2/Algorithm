import java.util.*;

class Solution {
    public int[] solution(int[] arr, int divisor) {
        int[] answer = {-1};
        int count = 0;
        for(int i=0; i<arr.length; i++) {
            if(arr[i]%divisor==0) {
                count++;
            }
        }
        
        if(count>=1) {
            answer = new int[count];
        }
        for(int i=0; i<arr.length; i++) {
            if(arr[i]%divisor == 0) {
                answer[count-1] = arr[i];
                count--;
            }
        }
        Arrays.sort(answer);
        return answer;
    }
}