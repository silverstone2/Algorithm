class Solution {
    public int solution(int num, int k) {
        int answer = 0;
        String str = String.valueOf(num);
        char c = (char)(k+'0');
        for(int i=0; i<str.length(); i++) {
            if(str.charAt(i) == c) {
                answer = i+1;
                break;
            } else {
                answer = -1;
            }
        }
        return answer;
    }
}