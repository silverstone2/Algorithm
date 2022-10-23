import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 배열의 크기 n , 테스트케이스 수 m 입력
		int n = sc.nextInt();
		int m = sc.nextInt();
		// n크기의 2차원 배열 및 합 배열 선언
		int[][] arr = new int[n+1][n+1];
		int[][] res = new int[n+1][n+1];
		// arr배열에 값 입력
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=n; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		
		// 합 배열 값 저장
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=n; j++) {
				// 구간 합 공식 이용해서 값 채우기(ex) 사각형에서 왼쪽 상단 값을 전체값에서 빼주면 된다!
				res[i][j] = res[i][j-1] + res[i-1][j] - res[i-1][j-1] + arr[i][j];
			}
		}
		
		// 테스트케이스 수만큼 반복하여 값 도출
		for(int i=0; i<m; i++) {
			// 시작과 종료 위치 좌표 입력
			int x1 = sc.nextInt();
			int y1 = sc.nextInt();
			int x2 = sc.nextInt();
			int y2 = sc.nextInt();
			// 위치의 구간 합 공식 적용히여 결과 출력
			// 구간합을 입력했던 res 2차원 배열의 값에서 시작위치와 안 겹치는 부분을 전부 빼주고 두 부분이 겹치는 제일 첫번째 위치만 값을 더해서 중복차를 막아준다.
			int result = res[x2][y2] - res[x1-1][y2] - res[x2][y1-1] + res[x1-1][y1-1];
			System.out.println(result);
		}
	}
}
