import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		double defense = a - (a * (0.01*b));
		
		if(defense >= 100) {
			System.out.println(0);
		} else {
			System.out.println(1);
		}
	}
}
