class Solution {
    public int solution(int n) {
        int answer = 0;
        int num = 1;
        for(int i=1; i<11; i++) {
            num *= i;
            
            if(num == n) {
                answer = i;
            }
            if(num > n) {
                answer = i-1;
                break;
            }
        }
        return answer;
    }
}