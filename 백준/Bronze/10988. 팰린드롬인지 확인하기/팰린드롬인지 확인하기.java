import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		char[] c = str.toCharArray();
		String str2 = "";
		for(int i=c.length-1; i>=0; i--) {
			str2 += c[i];
		}
		if(str.equals(str2)) {
			System.out.println(1);
		} else {
			System.out.println(0);
		}
	}
}
