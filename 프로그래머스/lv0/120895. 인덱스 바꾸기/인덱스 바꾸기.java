class Solution {
    public String solution(String my_string, int num1, int num2) {
        String answer = "";
        String[] str = my_string.split("");
        
        for(int i=0; i<str.length; i++) {
            if(i == num1) {
                answer += str[num2];
            } else if(i == num2) {
                answer += str[num1];
            } else {
                answer += str[i];
            }
        }
        return answer;
    }
}