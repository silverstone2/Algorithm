class Solution {
    public String solution(String s) {
        String answer = "";
        String[] str = s.split("");
        if(str.length==1) {
            answer = s;
        } else {
            if(str.length%2 != 0) {
                answer = str[str.length/2];
            } else if(str.length%2==0){
                answer += str[str.length/2-1];
                answer += str[str.length/2];
            }
        }
        return answer;
    }
}