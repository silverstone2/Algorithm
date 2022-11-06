import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 첫번째 사람 나이 입력
		int first_age = sc.nextInt();
		// 중간 사람 나이 입력
		int mid_age = sc.nextInt();
		// 마지막 사람 나이 = 중간사람 나이 + (중간사람 나이 - 첫째 사람 나이)
		int last_age = mid_age + (mid_age - first_age);
		// 결과출력
		System.out.println(last_age);
	}
}
