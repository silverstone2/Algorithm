import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
//		- 2진수를 바로 8진수로 바꾸는 방법 코드
//		1. 자리수가 딱 3에 나누어 떨어지도록 0이나 00을 추가한다//		
//		2. 3자리씩 끊어서 0번째에는 2^0, 1번째에는 2^1, 2번째에는 2^2를 곱하고, 그 결과를 더한다
//		3. 각 계산 결과를 이어서 붙이면 8진수가 나온다
		
//		주어진 수의 길이가 1,000,000까지 이기때문에, 숫자형으로 했다가는 범위가 넘친다
		Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        // 3자리씩 끊을 수 있도록 자리수 맞추기
        int size = str.length();
        if (size%3==2) str = "0" + str;
        if (size%3==1) str = "00" + str;
        //변환할 8진수를 담을 sb
        StringBuilder sb = new StringBuilder();
        //각 자리수 연산 결과를 임시로 담을 변수
        int a = 0;
        int b = 0;
        int c = 0;
        for (int i = str.length()-1; i >= 0; i--) {
            int num = str.charAt(i) - '0';
            //반복문을 돌면서 각 자리수 계산
            if (i%3==2) a = num*1;
            else if (i%3==1) b = num*2;
            else if (i%3==0){
                c = num*4;
                sb.append(a+b+c);
            }
        }
        System.out.println(sb.reverse());
	}
}