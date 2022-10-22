import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 문장의 갯수를 n이라는 변수로 입력 받음. 이때 nextInt로 받지 않는 이유는 자동 개행때문에 1. 가 출력이 안되고 먹혀들어가기 때문
		int n = Integer.parseInt(sc.nextLine());
		// 문장 입력을 위한 반복문 실행
		for(int i=0; i<n; i++) {
			System.out.println((i+1)+". "+sc.nextLine());
		}
	}
}
