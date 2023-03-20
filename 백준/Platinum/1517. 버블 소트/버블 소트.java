import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


// 버블소트 사용시 시간초과 발생

public class Main {
	public static int[] A;
	public static int[] tmp;
	public static long result;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		A = new int[N+1];
		tmp = new int[N+1];
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		for(int i=1; i<N+1; i++) {
			A[i] = Integer.parseInt(st.nextToken());
		}
		
		result = 0;
		merget_sort(1, N); // 병합정렬 수행
		System.out.println(result);
	}
	
	public static void merget_sort(int s, int e) {
		if(e-s < 1) {
			return;
		}
		
		int m = s + (e-s) / 2;
		
		// 재귀함수 형태로 구현
		merget_sort(s, m);
		merget_sort(m+1, e);
		for(int i=s; i<e+1; i++) {
			tmp[i] = A[i];
		}
		
		int k = s;
		int index1 = s;
		int index2 = m+1;
		// 두 그룹을 병합하는 로직
		while(index1 <= m && index2 <= e) {
			if(tmp[index1] > tmp[index2]) {
				A[k] = tmp[index2];
				// 뒤쪾 데이터 값이 작은 경우 result값을 업데이트
				result = result + index2 - k;
				k++;
				index2++;
			} else {
				A[k] = tmp[index1];
				k++;
				index1++;
			}
		}
		
		while(index1<=m) {
			A[k] = tmp[index1];
			k++;
			index1++;
		}
		
		while(index2<=e) {
			A[k] = tmp[index2];
			k++;
			index2++;
		}
	}
}
