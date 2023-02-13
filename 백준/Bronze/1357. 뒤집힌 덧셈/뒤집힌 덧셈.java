import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		
		int rx = rev(x);
		int ry = rev(y);
		int sum = rev(rx+ry);
		System.out.println(sum);
	}
	
	private static int rev(int n) {
		String str = "";
		while(n > 0) {
			str += n % 10;
			n /= 10;
		}
		return Integer.parseInt(str);
	}
}
