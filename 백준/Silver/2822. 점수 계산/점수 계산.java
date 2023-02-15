import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] score = new int[8];
		int[] arr = new int[8];
		int[] sub = new int[5];
		int sum = 0;
		
		for(int i=0; i<8; i++) {
			score[i] = sc.nextInt();
			arr[i] = score[i];
		}
		Arrays.sort(arr);

		
		for(int i=3; i<8; i++) {
			sum += arr[i];
		}
		
		for(int i=0; i<8; i++) {
			if(arr[3] == score[i]) {
				sub[0] = i;
			}
			if(arr[4] == score[i]) {
				sub[1] = i;
			}
			if(arr[5] == score[i]) {
				sub[2] = i;
			}
			if(arr[6] == score[i]) {
				sub[3] = i;
			}
			if(arr[7] == score[i]) {
				sub[4] = i;
			}
		}
		Arrays.sort(sub);
		System.out.println(sum);
		for(int i=0; i<sub.length; i++) {
			System.out.print(sub[i]+1+" ");
		}
	}
}
