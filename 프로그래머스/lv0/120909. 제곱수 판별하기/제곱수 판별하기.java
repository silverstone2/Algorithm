class Solution {
    public int solution(int n) {
        int answer = 2;
        for(int i=1; i<1001; i++) {
            if(i*i == n){
                answer = 1;
            }
        }
        return answer;
    }
}