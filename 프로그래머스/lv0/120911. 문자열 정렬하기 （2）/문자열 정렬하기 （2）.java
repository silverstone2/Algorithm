import java.util.Arrays;

class Solution {
    public String solution(String my_string) {
        String answer = "";
        String str = "";
        str = my_string.toLowerCase();
        char[] c = str.toCharArray();
        Arrays.sort(c);
        answer = new String(c);
        return answer;
    }
}