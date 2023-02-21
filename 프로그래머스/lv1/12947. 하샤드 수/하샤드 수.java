class Solution {
    public boolean solution(int x) {
        boolean answer = false;
        int sum = 0;
        int n = x;
        
        while(n>=1) {
            sum += n % 10;
            n /= 10;
        }
        if(x%sum==0) {
            answer = true;
        }
        return answer;
    }
}