import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 수의 개수 입력
		int n = sc.nextInt();
		// 합을 구하는 횟수 입력
		int m = sc.nextInt();
		// n개의 수를 입력받을 배열 선언
		int[] arr = new int[n];
		// 구간 i, j 선언 및 초기화
		int i = 0;
		int j = 0;
		// 합 배열에 사용될 배열 선언
		long[] s = new long[n+1];
		// 최종결과 result 변수 선언 및 초기화
		long result = 0;
		
		// n개의 수 입력
		for(int k=0; k<n; k++) {
			arr[k] = sc.nextInt();
		}
		
		// 합 배열에 값 집어넣기
		for(int k=1; k<=n; k++) {
			s[k] = s[k-1] + arr[k-1];
		}
		
		// 구간 합의 범위 i,j 입력 및 구간 합 공식을 사용해 결과값 result에 넣고 출력
		for(int k=0; k<m; k++) {
			i = sc.nextInt();
			j = sc.nextInt();
			result = s[j] - s[i-1];
			System.out.println(result);
		}
	}
}
