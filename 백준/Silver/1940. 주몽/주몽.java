import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[] arr = new int[n];
		for(int i=0; i<n; i++) {
			arr[i] = sc.nextInt();
		}
		Arrays.sort(arr);
		
		int s = 0;
		int e = n-1;
		int count = 0;
		while(s<e) {
			if((arr[s] + arr[e]) > m) {
				e--;
			} 
			else if((arr[s] + arr[e]) < m) {
				s++;
			}
			else {
				count++;
				s++;
				e--;
			}
		}
		System.out.println(count);
	}
}
