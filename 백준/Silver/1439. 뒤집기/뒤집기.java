import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		String[] str = s.split("");
		int zero = 0;
		int one = 0;
		
		if(str[0].equals("0")) {
			zero++;
		} else {
			one++;
		}
		
		for(int i=1; i<str.length; i++) {
			if(!str[i-1].equals(str[i])) {
				if(str[i].equals("0")) {
					zero++;
				} else {
					one++;
				}
			}
		}
		System.out.println(Math.min(zero, one));
	}
}
