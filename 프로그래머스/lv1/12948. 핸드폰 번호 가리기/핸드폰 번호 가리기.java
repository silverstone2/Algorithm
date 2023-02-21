class Solution {
    public String solution(String phone_number) {
        String answer = "";
        char[] c = new char[phone_number.length()];
        for(int i=0; i<c.length; i++) {
            c[i] = phone_number.charAt(i);
        }
        for(int i=0; i<c.length-4; i++) {
            answer += "*";
        }
        for(int i=c.length-4; i<c.length; i++) {
            answer += c[i];
        }
        return answer;
    }
}