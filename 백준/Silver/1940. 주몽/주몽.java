import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 재료 수 n과 제작가능한 갑옷 수 m 입력
		int n = sc.nextInt();
		int m = sc.nextInt();
		// 배열에 재료성분 입력
		int[] arr = new int[n];
		for(int i=0; i<n; i++) {
			arr[i] = sc.nextInt();
		}
		// 정렬 알고리즘 사용을 위한 정렬 실행
		Arrays.sort(arr);
		
		// 시작지점 s와 끝지점 e 그리고 값이 같을 때 세줄 count 변수 선언 및 초기화
		int s = 0;
		int e = n-1;
		int count = 0;
		/*
		 * 투포인터 이동 원칙
		 * A[i] + A[j] > M : j--;
		 * A[i] + A[j] < M : i++;
		 * A[i] + A[j] == M : count++; i++; j--;
		 */
		while(s<e) {
			// 만약 시작배열과 끝배열이 m보다 크다면 끝배열 빼주기
			if((arr[s] + arr[e]) > m) {
				e--;
			}
			// m보다 작을때는 시작배열을 올려주기
			else if((arr[s] + arr[e]) < m) {
				s++;
			}
			else {
				// 캍을 때는 양쪽 다 올리고 빼주고 카운트 올려주기
				count++;
				s++;
				e--;
			}
		}
		System.out.println(count);
	}
}
