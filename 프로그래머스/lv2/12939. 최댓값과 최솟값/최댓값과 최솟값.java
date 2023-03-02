import java.util.Arrays;

class Solution {
    public String solution(String s) {
        String answer = "";
        String[] str = s.split(" ");
        int[] n = new int[str.length];
        for(int i=0; i<str.length; i++) {
            n[i] = Integer.parseInt(str[i]);
        }
        Arrays.sort(n);
        answer = Integer.toString(n[0]) + " " + Integer.toString(n[str.length-1]);
        return answer;
    }
}