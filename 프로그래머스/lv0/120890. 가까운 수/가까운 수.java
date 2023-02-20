import java.util.*;

class Solution {
    public int solution(int[] array, int n) {
        int answer = 0;
        int[] minus_arr = new int[array.length];
        int min = 100;
        int num = 0;
        Arrays.sort(array);
        for(int i=0; i<array.length; i++) {
            minus_arr[i] = Math.abs((n-array[i]));
            if(minus_arr[i] < min) {
                min = minus_arr[i];
                num = i;
            }
        }
        answer = array[num];
        return answer;
    }
}