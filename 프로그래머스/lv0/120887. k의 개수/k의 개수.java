class Solution {
    public int solution(int i, int j, int k) {
        int answer = 0;
        String sk = String.valueOf(k);
        for(int t=i; t<j+1; t++) {
            String s = String.valueOf(t);
            if(s.contains(sk)) {
                String[] str = s.split("");
                for(String arr : str) {
                    if(arr.equals(sk)) {
                        answer++;
                    }
                }
            }
        }
        return answer;
    }
}