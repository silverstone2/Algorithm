class Solution {
    public boolean solution(String s) {
        boolean answer = true;
        char[] c = s.toCharArray();
        if(c.length != 4 && c.length != 6) {
            answer = false;
        }
        for(int i=0; i<c.length; i++) {
            if(!((int)c[i] >= 48 && (int)c[i] <=57)) {
                answer = false;
            }
        }
        return answer;
    }
}