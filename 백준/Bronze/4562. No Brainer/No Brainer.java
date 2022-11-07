import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 반복 횟수 n 입력
		int n = sc.nextInt();
		// 0부터 n-1까지 반복
		for(int i=0; i<n; i++) {
			// x,y 입력
			int x = sc.nextInt();
			int y = sc.nextInt();
			// x가 y보다 크거나 같을 경우 MMM BRAINS 출력
			if(x >= y) {
				System.out.println("MMM BRAINS");
			}
			// 아닐경우 NO BRAINS 출력
			else {
				System.out.println("NO BRAINS");
			}
		}
	}
}
