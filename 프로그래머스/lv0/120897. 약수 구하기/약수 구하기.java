class Solution {
    public int[] solution(int n) {
        int[] num = new int[n];
        int count = 0;
        
        for(int i=1; i<=n; i++) {
            if(n%i==0) {
                num[count] = i;
                count++;
            }
        }
        
        int[] answer = new int[count];
        for(int i=0; i<count; i++) {
            answer[i] = num[i];
        }
        return answer;
    }
}