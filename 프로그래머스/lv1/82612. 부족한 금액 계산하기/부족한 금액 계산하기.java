class Solution {
    public long solution(int price, int money, int count) {
        long answer = -1;
        long sum = 0;
        for(int i=1; i<count+1; i++) {
            sum += (price*i);
        }
        if(sum-money <= 0) {
            answer = 0;
        } else {
            answer = sum - money;
        }
        return answer;
    }
}