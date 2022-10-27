import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 수의 개수 n 입력
		int n = sc.nextInt();
		// n개의 수를 담을 배열 선언
		int[] arr = new int[n];
		// 배열의 값 입력
		for(int i=0; i<n; i++) {
			arr[i] = sc.nextInt();
		}
		// 기준이 될 숫자 입력
		int v = sc.nextInt();
		// 같을 때의 숫자를 count라는 변수로 선언하고 초기화
		int count = 0;
		
		// 반약 arr배열의 원소값이 v와 같다면 count를 늘린다
		for(int i=0; i<n; i++) {
			if(arr[i] == v) {
				count++;
			}
		}
		// 최종 결과 출력
		System.out.println(count);
	}
}