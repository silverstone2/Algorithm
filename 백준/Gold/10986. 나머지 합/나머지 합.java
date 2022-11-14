import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 수열의 개수 n, 나눠떨어져야하는 수 m 입력
		int n = sc.nextInt();
		int m = sc.nextInt();
		// 합배열 S와 m으로 나눴을 때의 나머지 값을 넣을 R 배열 선언
		// n과 m의 범위가 적지만 합배열이기 때문에 수가 int의 범위를 초과할 수 있어서 long형으로 선언
		long[] S = new long[n];
		long[] R = new long[m];
		// 결과값 0으로 초기화
		long result = 0;
		
		// 합배열을 위해 0번째 인덱스 입력
		S[0] = sc.nextInt();
		// 합배열 인덱스 값 넣기
		for(int i=1; i<n; i++) {
			S[i] = S[i-1] + sc.nextInt();
		}
		
		// 합배열 안의 모든 값에 모듈러스 연산 수행
		for(int i=0; i<n; i++) {
			// 나눠떨어지는 식을 remain 변수에 담기
			int remain = (int) (S[i] % m);
			// remain 값이 0이면 나눠떨어진다는 뜻으로 result 정답에다가 ++ 후위연산자 적용
			if(remain == 0) result++;
			// 나머지가 같은 인덱스의 개수를 세준다
			R[remain]++;
		}
		
		// m만큼 반복문 돌리기(어차피 나머지가 같은 인덱스의 개수에 대한 경우의 수를 구하는 것이기 때문)
		for(int i=0; i<m; i++) {
			// 만약 R배열의 값이 1보다 큰 여러개 라면
			if(R[i] > 1) {
				// 나머지가 같은 인덱스 중에서 2개를 뽀는 경우의 수를 더한다(이유 : 문제에서 i, j 두개의 값에 대한 구간을 구하기 때문에)
				result = result + (R[i] * (R[i]-1) / 2);
			}
		}
		System.out.println(result);
	}
}