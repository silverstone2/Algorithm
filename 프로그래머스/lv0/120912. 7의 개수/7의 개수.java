class Solution {
    public int solution(int[] array) {
        int answer = 0;
        for(int i=0; i<array.length; i++) {
            String num = Integer.toString(array[i]);
            String[] str = num.split("");
            
            for(int j=0; j<str.length; j++) {
                if(str[j].equals("7")) {
                    answer++;
                }
            }
        }
        return answer;
    }
}