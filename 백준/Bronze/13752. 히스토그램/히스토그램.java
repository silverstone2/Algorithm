import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i=1; i<n+1; i++) {
			int num = sc.nextInt();
			for(int j=1; j<num+1; j++) {
				System.out.print("=");
			}
			System.out.println();
		}
	}
}
