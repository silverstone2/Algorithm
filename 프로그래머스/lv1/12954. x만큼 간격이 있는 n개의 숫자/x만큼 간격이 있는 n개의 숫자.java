class Solution {
    public long[] solution(int x, int n) {
        long[] answer = new long[n];
        int count = 1;
        answer[0] = x;
        for(long i=2; i<=n; i++) {
            answer[count] = x*i;
            count++;
        }
        return answer;
    }
}