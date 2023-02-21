class Solution {
    public int solution(int n) {
        int answer = 0;
        int min = 1000000;
        int x = 0;
        for(int i=1; i<=n; i++) {
            if(n%i==1) {
                x = i;
                if(x < min) {
                    min = x;
                }
            }
        }
        answer = min;
        return answer;
    }
}