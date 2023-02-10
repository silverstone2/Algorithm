import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int count = 0;
		int n = 64;
		
		while(x>0) {
			if(n>x) {
				n /= 2;
			} else {
				count++;
				x -= n;
			}
		}
		System.out.println(count);
	}
}
