class Solution {
    public int solution(int num) {
        int answer = 0;
        int count = 0;
        long n = num;
        while(n!=1) {
            if(n%2 == 0) {
                n /= 2;
                count++;
            } else {
                n = n * 3 + 1;
                count++;
            }
        }
        if(count>500) {
            answer = -1;
        } else {
            answer = count;
        }
        return answer;
    }
}