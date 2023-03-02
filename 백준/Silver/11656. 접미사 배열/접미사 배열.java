import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		String[] s2 = s.split("");
		String[] str = new String[s.length()];
		for(int i=0; i<str.length; i++) {
			for(int j=i; j<s2.length; j++) {
				str[i] += s2[j];
			}
		}
		Arrays.sort(str);
		for(int i=0; i<str.length; i++) {
			System.out.println(str[i].replaceAll("null", ""));
		}
	}
}
