import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] solider = new int[3];
		int max = 0;
		
		for(int i=0; i<3; i++) {
			solider[i] = sc.nextInt();
		}
		
		for(int i=0; i<3; i++) {
			if(solider[i] <= n) {
				max += solider[i];
			}
			if(solider[i] > n) {
				max += n;
			}
		}
		System.out.println(max);
	}
}