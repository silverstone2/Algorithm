import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] sample = new int[n];
		for(int i=0; i<n; i++) {
			sample[i] = sc.nextInt();
		}
		Arrays.sort(sample); // 이분 탐색시 반드시 정렬 필수
		
		int m = sc.nextInt();
		StringBuilder sb = new StringBuilder();
		for(int i=0; i<m; i++) {
			int key = sc.nextInt();
			sb.append(upperBound(sample, key) - lowerBound(sample, key)).append(' ');
		}
		System.out.println(sb);
	}
	
	
	private static int lowerBound(int[] sample, int key) {
		int lo = 0; 
		int hi = sample.length; 
		while (lo < hi) {
			int mid = (lo + hi) / 2;
			if (key <= sample[mid]) {
				hi = mid;
			}
			else {
				lo = mid + 1;
			}
		}
		return lo;
	}
	
	
	private static int upperBound(int[] sample, int key) {
		int lo = 0; 
		int hi = sample.length; 
		while (lo < hi) {
			int mid = (lo + hi) / 2;
			if (key < sample[mid]) {
				hi = mid;
			}
			else {
				lo = mid + 1;
			}
		}
		return lo;
	}
}