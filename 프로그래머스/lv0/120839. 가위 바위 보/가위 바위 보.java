class Solution {
    public String solution(String rsp) {
        String answer = "";
        char[] c = rsp.toCharArray();
        for(int i=0; i<c.length; i++) {
            if(c[i] == '2') {
                answer += '0';
            } else if(c[i] == '0') {
                answer += '5';
            } else if(c[i] == '5') {
                answer += '2';
            }
        }
        return answer;
    }
}