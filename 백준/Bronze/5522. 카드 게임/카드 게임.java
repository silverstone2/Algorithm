import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 총 합계값을 넣어줄 sum 변수 선언 및 초기화
		int sum = 0;
		// 5회 반복문 실행
		for(int i=0; i<5; i++) {
			// 숫자 입력받음과 동시에 sum값에 더해주기
			int n = sc.nextInt();
			sum += n;
		}
		// 총합 결과 출력
		System.out.println(sum);
	}
}
