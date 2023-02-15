class Solution {
    public double solution(int[] arr) {
        double answer = 0;
        double size = arr.length;
        for(int i=0; i<arr.length; i++) {
            answer += arr[i];
        }
        answer = answer / size;
        return answer;
    }
}