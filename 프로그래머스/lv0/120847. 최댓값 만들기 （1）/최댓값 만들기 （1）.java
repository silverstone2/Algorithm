import java.util.Arrays;

class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
        int max = 0;
        Arrays.sort(numbers);
        for(int i=1; i<numbers.length; i++) {
            int mul = numbers[i-1] * numbers[i];   
            if(mul > max) {
                max = mul;
            }
        }
        answer = max;
        return answer;
    }
}