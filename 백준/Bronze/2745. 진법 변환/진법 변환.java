import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		int n = sc.nextInt();
		int answer = 0;
		
		for(int i=0; i<s.length(); i++) {
			char c = s.charAt(i);
			if(c >= 'A' && c <= 'Z') {
				answer = answer * n + ((c-'A') + 10);
			} else {
				answer = answer * n + (c-'0');
			}
		}
		System.out.println(answer);
	}
}
