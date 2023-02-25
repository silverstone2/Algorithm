class Solution {
    public String solution(int age) {
        String answer = "";
        String s = String.valueOf(age);
        String[] str = s.split("");
        for(int i=0; i<str.length; i++) {
            answer += (char)(Integer.parseInt(str[i])+97);
        }
        return answer;
    }
}