import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		
		// st라는 변수에 str 문자열에서 공백을 기준으로 나눈 토큰들을 저장한다.
		StringTokenizer st = new StringTokenizer(str, " ");
		
		// st에 담겨있는 토큰들을 출력
		System.out.println(st.countTokens());
	}
}
