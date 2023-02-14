class Solution {
    public String solution(String my_string) {
        String answer = "";
        int tmp;
        for(int i=0; i<my_string.length(); i++) {
            tmp = (int)my_string.charAt(i);
            if(tmp >= 65 && tmp <= 90) {
                answer += (char)(tmp+32);
            } else if(tmp >= 97 && tmp <= 122) {
                answer += (char)(tmp-32);
            } else {
                answer += (char)tmp;
            }
        }
        return answer;
    }
}