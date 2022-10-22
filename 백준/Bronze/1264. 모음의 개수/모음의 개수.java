import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		// 입력을 받기 위한 Scanner 메소드 선언 및 호출
		Scanner sc = new Scanner(System.in);
		
		// 반복문 실행
		while(true) {
			// String type의 str이라는 변수명으로 입력을 받음
			String str = sc.nextLine();
			// aeiou 대소문자를 index라는 변수명의 리스트 생성
			char[] index = {'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'};
			// aeiou가 적힌 횟수를 세주는 count 변수 선언
			int count = 0;
			
			// 만약 "#"이라는 문자와 입력한 문자가 같다면
			if(str.equals("#")) {
				// 반복문 종료
				break;
			}
			
			// str의 길이만큼 for문 돌리기
			for(int i=0; i<str.length(); i++) {
				// str의 한글자를 char 타입의 c라는 변수로 선언
				char c = str.charAt(i);
				// 인덱스 리스트 크기만큼 반복문 돌려서 검사
				for(int j=0; j<index.length; j++) {
					// 만일 인덱스 리스트의 요소값과 c가 같다면
					if(c == index[j]) {
						// count를 1씩 올려라
						count++;
					}
				}
			}
			// 다 누적된 count값 출력
			System.out.println(count);
		}
	}
}
