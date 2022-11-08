import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {	
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		// 숫자 개수 n 입력
		int n = Integer.parseInt(br.readLine());
		// n개의 숫자를 담을 배열 선언
		bubble[] arr = new bubble[n];
		// 숫자 입력
		for(int i=0; i<n; i++) {
			arr[i] = new bubble(Integer.parseInt(br.readLine()), i);
		}
		// 오름차순으로 arr 배열 정렬
		Arrays.sort(arr);
		
		int max = 0;
		for(int i=0; i<n; i++) {
			// 정렬 전 index - 정렬 후 index 계산의 최댓값을 max 변수에 저장
			if(max < arr[i].index - i) {
				max = arr[i].index - i;
			}
		}
		System.out.println(max+1);
		br.close();
	}
}

class bubble implements Comparable<bubble> {
	int value;	// 변경 후의 값
	int index;	// 변경 전의 값
	
	public bubble(int value, int index) {
		this.value = value;
		this.index = index;
	}
	
	// value 기준 오름차순 정렬
	@Override
	public int compareTo(bubble o) {
		return this.value - o.value;
	}
}