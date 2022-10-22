import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 각각의 세 각 입력
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		// 세 각의 합을 sum 이라는 변수에 넣기
		int sum = a+b+c;
		
		// 만약 세 각의 합이 180도 가 아니면 Error 출력
		if(sum != 180) {
			System.out.println("Error");
		}
		// 만약 세 각이 모두 60도 이면 Equilateral 출력
		else if(a == b && a == c && a == 60) {
			System.out.println("Equilateral");
		}
		// 만약 세 각의 합이 180이고 두 각이 같으면 Isosceles 출력
		else if((sum == 180) && ((a == b) || (a==c) || (b==c))) {
			System.out.println("Isosceles");
		}
		// 만약 세 각의 합이 180이고 각각의 각이 같지 않으면 Scalene 출력
		else if((sum == 180) && (a!=b) && (a!=c) && (b!=c)) {
			System.out.println("Scalene");
		}
	}
}
