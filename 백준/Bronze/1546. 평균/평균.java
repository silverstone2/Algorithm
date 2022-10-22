import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new  Scanner(System.in);
		// 과목의 개수 n 입력
		int n = sc.nextInt();
		// n개 과목의 현재 성적을 넣을 배열 선언
		double[] score = new double[n];
		// 현재 성적 중 최댓값 m
		double m = 0;
		// 모든 성적의 합
		double sum = 0;
		// 성적의 평균
		double avr = 0;
		
		// 각 과목 성적 입력
		for(int i=0; i<n; i++) {
			score[i] = sc.nextInt();
		}
		
		// 최댓값 및 총합 구하기
		for(int i=0; i<n; i++) {
			if(m < score[i]) {
				m = score[i];
			}
			sum += score[i];
		}
		// 평균식 입력
		avr = sum*100 / m / n;
		// 최종결과 출력
		System.out.println(avr);
	}
}
