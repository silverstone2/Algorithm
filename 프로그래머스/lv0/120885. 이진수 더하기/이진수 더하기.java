class Solution {
    public String solution(String bin1, String bin2) {
        int b1 = Integer.parseInt(bin1, 2);
        int b2 = Integer.parseInt(bin2, 2);
        int sum = b1 + b2;
        String answer = Integer.toBinaryString(sum);
        return answer;
    }
}