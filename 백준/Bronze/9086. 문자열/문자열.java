import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int t=0; t<T; t++) {
			String str = sc.next();
			int size = str.length()-1;
			String start = String.valueOf(str.charAt(0));
			String end = String.valueOf(str.charAt(size));
			
			System.out.println(start+end);
		}
	}
}
