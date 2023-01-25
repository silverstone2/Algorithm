import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		for(int i=0; i<n; i++) {
			int p = sc.nextInt();
			int[] c = new int[p];
			String[] name = new String[p];
			int max = 0;
			String max_name = "";
			
			for(int j=0; j<p; j++) {
				c[j] = sc.nextInt();
				name[j] = sc.next();
				if(c[j] > max) {
					max = c[j];
					max_name = name[j];
				}
			}
			System.out.println(max_name);
		}
	}
}