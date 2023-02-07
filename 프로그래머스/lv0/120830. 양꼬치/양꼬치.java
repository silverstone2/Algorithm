class Solution {
    public int solution(int n, int k) {
        int answer = 0;
        if(n / 10 != 0) {
            k = k-(n/10);
        }
        int sum = (12000*n) + (2000*k);
        answer = sum;
        return answer;
    }
}