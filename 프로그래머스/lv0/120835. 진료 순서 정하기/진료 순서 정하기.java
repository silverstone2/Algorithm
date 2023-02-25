import java.util.*;

class Solution {
    public int[] solution(int[] emergency) {
        int[] answer = new int[emergency.length];
        int[] eme = new int[emergency.length];
        for(int i=0; i<eme.length; i++) {
            eme[i] = emergency[i];
        }
        Arrays.sort(eme);
        
        for(int i=0; i<eme.length; i++) {
            for(int j=0; j<eme.length; j++) {
                if(eme[i]==emergency[j]) {
                    answer[i] = eme.length-j;
                }
            }
        }
        return answer;
    }
}