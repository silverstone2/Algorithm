import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 문제의 체스 기본 옵션 선언
		int[] chess = {1, 1, 2, 2, 2, 8};
		// 동혁이가 찾은 말의 개수값을 담을 배열 선언
		int[] res = new int[6];
		// 최종 결과를 출력할 배열 선언
		int[] total = new int[6];
		// 동혁이가 찾은 말의 개수 입력
		for(int i=0; i<6; i++) {
			res[i] = sc.nextInt();
		}
		// 필요말 개수 = 기본옵션 - 동혁이가 찾은 말의 수
		for(int i=0; i<6; i++) {
			total[i] = chess[i] - res[i];
			System.out.print(total[i]+" ");
		}
	}
}
