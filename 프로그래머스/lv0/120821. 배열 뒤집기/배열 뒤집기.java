class Solution {
    public int[] solution(int[] num_list) {
        int size = num_list.length;
        int[] answer = new int[size];
        for(int i=size-1; i>=0; i--) {
            answer[size-i-1] = num_list[i];
        }
        return answer;
    }
}