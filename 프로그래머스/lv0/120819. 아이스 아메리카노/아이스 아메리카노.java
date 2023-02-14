class Solution {
    public int[] solution(int money) {
        int[] answer = new int[2];
        answer[0] = money / 5500;
        if(money % 5500 == 0) {
            answer[1] = 0;
        } else {
            answer[1] = money % 5500;
        }
        return answer;
    }
}