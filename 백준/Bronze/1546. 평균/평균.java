import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new  Scanner(System.in);
		int n = sc.nextInt();
		double[] score = new double[n];
		double m = 0;
		double sum = 0;
		double avr = 0;
		
		for(int i=0; i<n; i++) {
			score[i] = sc.nextInt();
		}
		
		for(int i=0; i<n; i++) {
			if(m < score[i]) {
				m = score[i];
			}
			sum += score[i];
		}
		avr = sum*100 / m / n;
		System.out.println(avr);
	}
}
