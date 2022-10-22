import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 알파벳 수만큼 배열 선언
		int[] arr = new int[26];
		
		//입력이 없을때까지 반복문 돌리기
		while(sc.hasNextLine()) {
			// 주어질 문장 입력
			String str = sc.nextLine();
			// 문장의 길이만큼 반복문 실행
			for(int i=0; i<str.length(); i++) {
				// 만약 소문자 a ~ z 까지의 문자로 구성이 되어 있다면
				if(str.charAt(i) >= 'a' && str.charAt(i) <= 'z') {
					// 해당 알파벳을 배열에다가 1씩 더해준다.
					arr[str.charAt(i) - 'a']++;
				}
			}
		}
		// 최댓값 비교를 위한 max 변수 선언
		int max = 0;
		// 알파벳의 개수인 26으로 반복문 실행
		for(int i=0; i<26; i++) {
			// 만약 max 보다 알파벳의 등장 수가 더 크면
			if(max < arr[i]) {
				// 더 큰 값을 최댓값으로 지정
				max = arr[i];
			}
		}
		
		// 만약 최댓값과 알파벳 등장수가 같으면 해당 알파벳의 등장 수 출력
		for(int i=0; i<26; i++) {
			if(max == arr[i]) {
				System.out.print((char) (i + 'a'));				
			}
		}
	}
}