import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		int[] arr = new int[str.length()];
		// substring을 이용해서 문자열을 문자로 쪼개기
		for(int i=0; i<str.length(); i++) {
			arr[i] = Integer.parseInt(str.substring(i, i+1));
		}
		// 반복문 사용하여 최댓값 찾아내기
		for(int i=0; i<str.length(); i++) {
			int max = i;
			for(int j=i+1; j<str.length(); j++) {
				// j를 i보다 1크게 설정하여 내림차순으로 현재범위에서의 최댓값을 찾아준다.
				if(arr[j] > arr[max]) {
					max = j;
				}
			}
			
			// 현재의 i값과 max 갑 중에서 max 값이 더 크면 swap을 수행한다.
			// 이 때, 자바는 동시에 바꾸는게 불가능하기 때문에 tmp라는 임시변수를 통해서 값을 옮긴 후에 변경해준다.
			if(arr[i] < arr[max]) {
				int tmp = arr[i];
				arr[i] = arr[max];
				arr[max] = tmp;
			}
		}
		// 최종 출력
		for(int i=0; i<str.length(); i++) {
			System.out.print(arr[i]);
		}
	}
}
