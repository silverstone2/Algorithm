import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int[] score = new int[n];
		
		for(int i=0; i<n; i++) {
			score[i] = sc.nextInt();
		}
		Arrays.sort(score);
		
		System.out.println(score[n-k]);
	}
}
