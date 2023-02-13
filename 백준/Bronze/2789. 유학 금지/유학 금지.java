import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		char[] c = str.toCharArray();
		
		for(int i=0; i<c.length; i++) {
			if(c[i] == 'C' || c[i] == 'A' || c[i] == 'M' || c[i] == 'B' || c[i] == 'R' || c[i] == 'I' || c[i] == 'D' || c[i] == 'G' || c[i] == 'E') {
				c[i] = ' ';
			}
		}
		str = new String(c).replaceAll(" ", "");
		System.out.println(str);
	}
}
