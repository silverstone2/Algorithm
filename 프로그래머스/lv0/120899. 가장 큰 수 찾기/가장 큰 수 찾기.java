class Solution {
    public int[] solution(int[] array) {
        int max = 0;
        int index = 0;
        
        for(int i=0; i<array.length; i++) {
            if(array[i] > max) {
                max = array[i];
                index = i;
            }
        }
        
        int[] answer = new int[2];
        answer[0] = max;
        answer[1] = index;
        return answer;
    }
}