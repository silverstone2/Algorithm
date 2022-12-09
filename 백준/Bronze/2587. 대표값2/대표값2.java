import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[5];
		for(int i=0; i<5; i++) {
			arr[i] = sc.nextInt();
		}
		Arrays.sort(arr);
		
		int sum = 0;
		int avr = 0;
		int center = 0;
		for(int i=0; i<arr.length; i++) {
			sum += arr[i];
			center = arr[2];
		}
		avr = sum / 5;
		System.out.println(avr);
		System.out.println(center);
	}
}