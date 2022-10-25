import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 수의 개수 n 입력
		int n = sc.nextInt();
		// n만큼 입력받을 배열 선언
		int[] num = new int[n];
		// 좋은 수의 개수를 세줄 count 변수 선언 및 초기화
		int count = 0;
		// n개수 만큼의 수 입력 및 배열에 저장
		for(int i=0; i<n; i++) {
			num[i] = sc.nextInt();
		}
		// 투포인터 알고리즘을 사용하기 위한 정렬 실행
		Arrays.sort(num);
		
		// 판별의 대상 g 선언 및 g가 n이 될 때까지 반복하며 좋은 수 유무 판별
		for(int g=0; g<n; g++) {
			// 시작지점 s, 끝지점 e 선언
			int s = 0;
			int e = n -1;
			// 시작지점의 값이 끝지점의 값보다 작을때 반복문 실행
			while(s<e) {
				// 만약 두 배열의 합이 판별의 대상과 같다면
				if((num[s]+num[e]) == num[g]) {
					// 투 포인터 s, e가 모두 g가 아니면 count에 반영 및 반복문 종료
					if(s!=g && e!=g) {
						count++;
						break;
					}
					// 시작포인터가 판별의 대상과 같다면 s++
					else if(s == g) {
						s++;
					}
					// 끝포인터가 판별의 대상과 같다면 e--
					else if(e == g) {
						e--;
					}
				}
				// 두 배열의 합이 판별의 대상보다 크다면 끝포인터--
				else if((num[s]+num[e]) > num[g]) {
					e--;
				}
				// 판별의 대상보다 작다면 시작포인터++
				else {
					s++;
				}
			}
		}
		// 최종 결과값 출력
		System.out.println(count);
	}
}
