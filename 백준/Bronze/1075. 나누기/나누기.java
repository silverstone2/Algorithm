import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int F = sc.nextInt();
		N = (N/100) * 100; // 마지막 두자리 00으로 바꾸기
		
		while(N%F != 0) // 나누어 떨어지는 수 찾기
			N++;
		
		N %= 100;
		
		if(N < 10) System.out.println("0" + N);
		else System.out.println(N);
	}
}