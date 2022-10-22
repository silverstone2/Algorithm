import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// 학생 30명의 정보를 담을 배열 선언
		int[] student = new int[31];
		// 제출한 학생들 입력(제출했을 때는 1의 값이 들어가도록 설정)
		for(int i=1; i<29; i++) {
			student[sc.nextInt()] = 1;
		}
		// 학생 전체에 대한 제출여부 검사
		for(int i=1; i<31; i++) {
			// 제출 안했을 시에는 해당 번호가 출력되도록 설정
			if(student[i] != 1) {
				System.out.print(i+" ");
			}
		}
	}
}
