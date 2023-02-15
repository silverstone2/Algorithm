
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[] num = new int[n];
		for(int i=0; i<n; i++) {
			num[i] = sc.nextInt();
		}
		
		int res = search(num, n, m);
		System.out.println(res);
	}
	
	static int search(int[] num, int n, int m) {
		int res = 0;;
		
		for(int i=0; i<n-2; i++) {
			for(int j=i+1; j<n-1; j++) {
				for(int k=j+1; k<n; k++) {
					int tmp = num[i] + num[j] + num[k];
					
					if(tmp == m) {
						return tmp;
					}
					
					if(res < tmp && tmp < m) {
						res = tmp;
					}
				}
			}
		}
		return res;
	}
}
