import java.util.*;

class Solution {
    public String solution(String my_string) {
        char[] c = my_string.toCharArray();
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<c.length; i++) {
            if(!sb.toString().contains(String.valueOf(c[i]))) {
                sb.append(c[i]);
            }
        }
        return sb.toString();
    }
}