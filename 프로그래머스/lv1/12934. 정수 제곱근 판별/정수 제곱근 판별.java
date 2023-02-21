class Solution {
    public long solution(long n) {
        long answer = -1;
        for(long i=1; i*i<=n; i++) {
            if(i*i==n) {
                answer = (long)Math.pow(i+1, 2);
            }
        }
        return answer;
    }
}