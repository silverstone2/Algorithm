import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] num = new int[3];
		for(int i=0; i<3; i++) {
			num[i] = sc.nextInt();
		}
		Arrays.sort(num);
		
		String str = sc.next();
		for(int i=0; i<str.length(); i++) {
			if(str.charAt(i) == 'A') {
				System.out.print(num[0]+" ");
			} else if(str.charAt(i) == 'B') {
				System.out.print(num[1]+" ");
			} else {
				System.out.print(num[2] + " ");
			}
		}
	}
}