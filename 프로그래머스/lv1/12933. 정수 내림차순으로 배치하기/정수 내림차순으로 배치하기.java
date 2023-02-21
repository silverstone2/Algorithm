import java.util.*;

class Solution {
    public long solution(long n) {
        long answer = 0;
        String str = String.valueOf(n);
        char[] c = new char[str.length()];
        for(int i=0; i<str.length(); i++) {
            c[i] = str.charAt(i);
            //System.out.println(c[i]);
        }
        Arrays.sort(c);
        String s = "";
        for(int i=c.length-1; i>=0; i--){
            s += c[i];
        }
        answer = Long.parseLong(s);
        return answer;
    }
}