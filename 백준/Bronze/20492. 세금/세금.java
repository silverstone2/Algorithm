import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println((int)(n*0.78) + " " + (int)(n*0.8 + (n*0.2*0.78)));
	}
}
