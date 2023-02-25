import java.util.*;

class Solution {
    public int solution(String before, String after) {
        int answer = 0;
        String[] b = before.split("");
        String[] a = after.split("");
        Arrays.sort(b);
        Arrays.sort(a);
        String be = "";
        String af = "";
        for(int i=0; i<b.length; i++) {
            be += b[i];
            af += a[i];
        }
        if(be.equals(af)) {
            answer = 1;
        }
        return answer;
    }
}