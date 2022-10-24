import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 자연수 N 입력
		int n = sc.nextInt();
		// 투포인터 방식에 사용할 두개의 포인터 선언
		// start, end 선언 및 1로 초기화;
		// sum 은 둘다 1에서 시작하기 때문에 1로 초기화
		// count는 N과 같은 숫자만 뽑는 경우의 수를 미리 넣고서 초기화 진행
		int start = 1;
		int end = 1;
		int sum = 1;
		int count = 1;
		
		// n가 15와 같지 않다면 반복문 계속 실행
		while(end!=n) {  
			// 만약 sum 과 n이 같다면 end를 올리고 count를 올린다
			if(sum == n) {
				count++;
				end++;
				// 이 때 sum은 end와 sum을 더해서 누적 합을 구한다..
				sum = sum + end;
				// 만약 sum이 n보다 클때는 start를 sum에서 빼주고 start는 한칸 위로 옮긴다.
			} else if(sum > n){
				sum = sum - start;
				start++;
				// 그 외의 경우인 sum이 n보다 작을 때는 end를 하나 올린다.
			} else {
				end++;
				sum = sum + end;
			}
		}
		// 최종으로 누적된 count를 결과값으로 출력한다.
		System.out.println(count);
	}
}
